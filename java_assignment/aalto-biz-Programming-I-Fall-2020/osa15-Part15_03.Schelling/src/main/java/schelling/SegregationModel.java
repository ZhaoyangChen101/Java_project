package schelling;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SegregationModel {

    private LocationArray locations;

    private double precentageOfLocationsInhabited;
    private int happinessLimit;
    private int numberOfGroups;

    private boolean active;

    public SegregationModel(int width, int height, int happinessLimit, int numberOfGroups, double precentageOfLocationsInhabited) {
        this.locations = new LocationArray(width, height);

        this.happinessLimit = happinessLimit;
        this.numberOfGroups = numberOfGroups;
        this.precentageOfLocationsInhabited = precentageOfLocationsInhabited;

        this.active = false;
    }

    public void start() {
        this.active = true;
    }

    public void stop() {
        this.active = false;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public void setPrecentageOfLocationsInhabited(double precentageOfLocationsInhabited) {
        this.precentageOfLocationsInhabited = precentageOfLocationsInhabited;
    }

    public void setHappinessLimit(int happinessLimit) {
        this.happinessLimit = happinessLimit;

    }

    public void initialize() {
        setRandomInitialValues();
    }

    public void setRandomInitialValues() {
        Random randomNumberMaker = new Random();

        for (int x = 0; x < locations.getWidth(); x++) {

            for (int y = 0; y < locations.getHeight(); y++) {

                //the method nextDouble of the Random class
                //returns a random number between 0 and 1
                double randomNumberBetweenZeroAndOne = randomNumberMaker.nextDouble();

                //if 100*value is smaller than precentageOfLocationsInhabited
                //a value is set in that location
                if (100 * randomNumberBetweenZeroAndOne < precentageOfLocationsInhabited) {
                    int group = 1 + randomNumberMaker.nextInt(numberOfGroups);

                    this.locations.setLocationValue(x, y, group);

                }
            }
        }
    }

    public LocationArray getData() {
        return this.locations;
    }

    public void setData(LocationArray locations) {
        this.locations = locations;
    }

    public ArrayList<Location> findEmptyLocations() {
        ArrayList<Location> emptyLocations = new ArrayList<>();
        // Create a list of all elements which have the value 0


        return emptyLocations;
    }

    public void update() {
        ArrayList<Location> unhappyPeople = findUnhappyPeople();

        if (unhappyPeople.isEmpty()) {
            return;
        }

        Collections.shuffle(unhappyPeople);

        while (!unhappyPeople.isEmpty()) {
            Location unhappy = unhappyPeople.remove(0);

            ArrayList<Location> emptyLocations = findEmptyLocations();
            Collections.shuffle(emptyLocations);

            Location emptyLocation = emptyLocations.get(0);

            int groupOfTheUnhappyPerson = this.locations.getLocationValue(unhappy.getX(), unhappy.getY());

            this.locations.setLocationValue(emptyLocation.getX(), emptyLocation.getY(), groupOfTheUnhappyPerson);
            this.locations.setLocationValue(unhappy.getX(), unhappy.getY(), 0);
        }
    }

    public ArrayList<Location> findUnhappyPeople() {
        ArrayList<Location> unhappyPeople = new ArrayList<>();
        // Etsi täällä tyytymättömät

        return unhappyPeople;
    }


}
