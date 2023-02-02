package schelling;

import fi.helsinki.cs.tmc.edutestutils.Points;
import java.util.ArrayList;
import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;

public class SegregationModelTest {

    private SegregationModel model;

    private String createNewModel = "SegregationModel model = new SegregationModel(10, 10, 5, 2, 70.0);\n";

    @Before
    public void setup() {
        this.model = new SegregationModel(10, 10, 5, 2, 70.0);
    }

    @Test
    @Points("15-03.1")
    public void canSetAndGetValues() {
        setValue(model, 0, 0, 1);
        setValue(model, 7, 5, 1);
        setValue(model, 5, 7, 1);
        setValue(model, 1, 2, 1);

        setValue(model, 7, 5, 0);
        setValue(model, 5, 7, 0);
        setValue(model, 1, 2, 0);
    }

    @Test
    @Points("15-03.1")
    public void returnsAllLocationsIfMapEmptied() {
        assertTrue("When a model with the height 10 and width 10 is created, and all locations are empty, the findEmptyLocations method should return 100 empty locations. Now there was: " + model.findEmptyLocations().size(), model.findEmptyLocations().size() == 100);

        setValue(model, 0, 0, 1);

        assertTrue("When a model with the height 10 and width 10 is created, and one location is not empty, the findEmptyLocations method should return 99 empty locations. Now there was: " + model.findEmptyLocations().size(), model.findEmptyLocations().size() == 99);

        for (Location emptyLocation : model.findEmptyLocations()) {
            assertFalse("When the location 0,0 has been set as not 0, it should not be on the list of empty locations", (int) emptyLocation.getX() == 0 && (int) emptyLocation.getY() == 0);
        }
    }

    @Test
    @Points("15-03.1")
    public void returnsEmptyLocations() {
        assertTrue("When a model with the height 10 and width 10 is created, and all locations are empty, the findEmptyLocations method should return 100 empty locations. Now there was: " + model.findEmptyLocations().size(), model.findEmptyLocations().size() == 100);

        LocationArray t = model.getData();
        int numberOfSetValues = 0;
        for (int x = 0; x < t.getWidth(); x++) {
            for (int y = 0; y < t.getHeight(); y++) {
                setValue(model, x, y, 1);
                numberOfSetValues++;
                assertTrue("When a model with the height 10 and width 10 is created, and  " + numberOfSetValues + " locations have been set inhabited, the findEmptyLocations method should return " + (100 - numberOfSetValues) + " empty locations. Now there was: " + model.findEmptyLocations().size(), model.findEmptyLocations().size() == (100 - numberOfSetValues));
            }
        }
    }

    @Test
    @Points("15-03.1")
    public void randomLocationsAndEmptyLocations() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            ArrayList<Location> locations = new ArrayList<>();

            for (int j = 0; j < 5 + random.nextInt(); j++) {
                Location p = new Location(random.nextInt(10), random.nextInt(10));

                if (locations.contains(p)) {
                    continue;
                }

                locations.add(p);
            }

            locations.stream().forEach(p -> {
                setValue(model, p.getX(), p.getY(), 1);
            });

            empty(model);

            assertTrue("When a model with the height 10 and width 10 is created, and all locations are empty, the findEmptyLocations method should return 100 empty locations. Now there was: " + model.findEmptyLocations().size(), model.findEmptyLocations().size() == 100);

            locations.stream().forEach(p -> {
                setValue(model, p.getX(), p.getY(), 1);
            });

            assertTrue("When a model with the height 10 and width 10 is created, and there is" + locations.size() + " not empty locations, the findEmptyLocations method should return " + (100 - locations.size()) + " empty locations. Now there was: " + model.findEmptyLocations().size(), model.findEmptyLocations().size() == 100 - locations.size());

            locations.stream().forEach(p -> {
                assertFalse("When location " + p.getX() + ", " + p.getY() + " has been set inhabited, it should not be on the list of empty locations.", model.findEmptyLocations().contains(p));
            });
        }
    }

    @Test
    @Points("15-03.2")
    public void findUnhappy() {
        model.setHappinessLimit(5);

        setValue(model, 0, 0, 1);
        setValue(model, 1, 0, 1);
        setValue(model, 0, 1, 1);
        setValue(model, 1, 1, 1);

        setValue(model, 1, 2, 2);
        setValue(model, 2, 1, 2);
        setValue(model, 2, 2, 2);
        setValue(model, 3, 2, 2);
        setValue(model, 2, 3, 2);
        setValue(model, 3, 3, 2);
        setValue(model, 2, 0, 2);
        setValue(model, 0, 2, 2);

        assertTrue("If the happiness limit is 5 and a person has  three similar neighbors, they should be unhappy.\n" + report(0, 0), model.findUnhappyPeople().contains(new Location(0, 0)));
        assertTrue("If the happiness limit is 5 and a person has  three similiar neighbors, they should be unhappy.\n" + report(1, 1), model.findUnhappyPeople().contains(new Location(1, 1)));
        assertFalse("If the happiness limit is 5 and a person has five similiar neighbors, they should be happy.\n" + report(2, 2), model.findUnhappyPeople().contains(new Location(2, 2)));
    }

    @Test
    @Points("15-03.2")
    public void findUnhappy2() {
        model.setHappinessLimit(3);

        setValue(model, 0, 0, 1);
        setValue(model, 1, 0, 1);
        setValue(model, 0, 1, 1);
        setValue(model, 1, 1, 1);
        setValue(model, 2, 0, 1);

        setValue(model, 1, 2, 2);
        setValue(model, 2, 1, 2);
        setValue(model, 2, 2, 2);
        setValue(model, 3, 2, 2);
        setValue(model, 2, 3, 2);
        setValue(model, 3, 3, 2);

        assertFalse("If the happiness limit is 3 and a person has three similar neighbors,  they should be happy.\n" + report(0, 0), model.findUnhappyPeople().contains(new Location(0, 0)));
        assertTrue("If the happiness limit is 3, and a person has two similiar neighbors, they should be unhappy. Do not cout the person themselves to the neighbors!\n" + report(2, 0), model.findUnhappyPeople().contains(new Location(2, 0)));
        assertFalse("If the happiness limit is 3, and a person has five similiar neighbors, they should be happy.\n" + report(2, 2), model.findUnhappyPeople().contains(new Location(2, 2)));
    }

    private String report(int xLocation, int yLocation) {

        String printOut = "Searched for location " + xLocation + ", " + yLocation + " from the array:\n";
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                printOut += getValue(model, x, y) + " ";
            }
            printOut += "\n";
        }

        printOut += "(Calculating the y coordinate starts from the upper-left corner)\n";
        return printOut;

    }

    private void setValue(SegregationModel model, double x, double y, int value) {
        if (model.getData() == null) {
            fail("Class SegregationModel method getData returned null-reference. This should not happen.");
            return;
        }

        int ix = (int) x;
        int iy = (int) y;

        model.getData().setLocationValue(ix, iy, value);

        assertEquals("Could not get and set values. Try:\n"
                + createNewModel
                + "model.getData().setData(" + ix + ", " + iy + ", " + value + ");\n"
                + "System.out.println(model.getData().setData(" + ix + ", " + iy + ");\n", value, getValue(model, ix, iy));
    }

    private int getValue(SegregationModel model, double x, double y) {
        if (model.getData() == null) {
            fail("SegregationModel-class method getData returned a null-reference. This should not happen.");
        }

        return model.getData().getLocationValue((int) x, (int) y);
    }

    private void empty(SegregationModel model) {
        if (model.getData() == null) {
            fail("SegregationModel-class method getData returned a null-reference. This should not happen.");
        }

        LocationArray t = model.getData();
        for (int x = 0; x < t.getWidth(); x++) {
            for (int y = 0; y < t.getHeight(); y++) {
                setValue(model, x, y, 0);
            }
        }
    }
}
