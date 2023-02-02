package schelling;


import java.util.HashMap;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SchellingApplication extends Application {

    private SegregationModel model;

    private Slider groups;
    private Slider precentageOfLocationsInhabited;
    private Slider happinessLimit;

    private Button startButton;

    public SchellingApplication() {
        super();

        this.model = new SegregationModel(80, 80, 5, 2, 70.0);

        this.groups = new Slider(2, 5, 2);
        this.groups.setShowTickLabels(true);
        this.groups.setShowTickMarks(true);
        this.groups.setMajorTickUnit(1.0);
        this.groups.setMinorTickCount(0);
        this.groups.setSnapToTicks(true);

        this.precentageOfLocationsInhabited = new Slider(0, 100, 70);
        this.precentageOfLocationsInhabited.setShowTickLabels(true);
        this.precentageOfLocationsInhabited.setShowTickMarks(true);
        this.precentageOfLocationsInhabited.setMajorTickUnit(25.0);
        this.precentageOfLocationsInhabited.setMinorTickCount(4);

        this.happinessLimit = new Slider(0, 9, 5);
        this.happinessLimit.setShowTickLabels(true);
        this.happinessLimit.setShowTickMarks(true);
        this.happinessLimit.setMajorTickUnit(1.0);
        this.happinessLimit.setMinorTickCount(0);
        this.happinessLimit.setSnapToTicks(true);

        this.startButton = new Button("Initialize and start the visualization");
    }

    @Override
    public void start(Stage stage) {
        final int width = 400;
        final int height = 400;

        stage.setTitle("Schelling");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(70);

        // create ui components and place them
        Canvas background = new Canvas(width, height);

        GridPane.setConstraints(background, 0, 0);
        GridPane.setColumnSpan(background, 2);
        grid.getChildren().add(background);

        Label groupsTitle = new Label("Number of groups: ");
        GridPane.setConstraints(groupsTitle, 0, 1);
        grid.getChildren().add(groupsTitle);
        GridPane.setConstraints(groups, 1, 1);
        grid.getChildren().add(groups);

        Label inhabitingPrecentageTitle = new Label("Precentage of locations inhabited(%): ");
        GridPane.setConstraints(inhabitingPrecentageTitle, 0, 2);
        grid.getChildren().add(inhabitingPrecentageTitle);
        GridPane.setConstraints(precentageOfLocationsInhabited, 1, 2);
        grid.getChildren().add(precentageOfLocationsInhabited);

        Label happinessLimitTitle = new Label("Happiness limit: ");
        GridPane.setConstraints(happinessLimitTitle, 0, 3);
        grid.getChildren().add(happinessLimitTitle);
        GridPane.setConstraints(happinessLimit, 1, 3);
        grid.getChildren().add(happinessLimit);

        GridPane.setConstraints(startButton, 0, 4);
        GridPane.setColumnSpan(startButton, 2);
        grid.getChildren().add(startButton);

        root.getChildren().add(grid);

        // What happens when the sliders are moved?
        groups.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            this.model.setNumberOfGroups(newValue.intValue());
        });

        precentageOfLocationsInhabited.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            this.model.setPrecentageOfLocationsInhabited(newValue.doubleValue());
        });

        happinessLimit.valueProperty().addListener((ObservableValue<? extends Number> ov, Number oldValue, Number newValue) -> {
            this.model.setHappinessLimit(newValue.intValue());
        });

        startButton.setOnAction((ActionEvent e) -> {
            if (model.isActive()) {
                model.stop();
                startButton.setText("Initialize and start visualization");
            } else {
                model.initialize();
                model.start();
                startButton.setText("Stop");
            }
        });

        // components for drawing the visualization
        GraphicsContext visualizationDrawer = background.getGraphicsContext2D();

        new AnimationTimer() {
            // update animation every 100 milliseconds
            private long sleepNanoseconds = 100 * 1000000;
            private long prevTime = 0;

            public void handle(long currentNanoTime) {
                // update animation every 200 milliseconds
                if ((currentNanoTime - prevTime) < sleepNanoseconds) {
                    return;
                }

                if (!model.isActive()) {
                    return;
                }

                // draw backgrounds
                visualizationDrawer.setFill(Color.WHITE);
                visualizationDrawer.clearRect(0, 0, width, height);

                // draw model
                LocationArray locations = model.getData();

                for (int x = 0; x < locations.getWidth(); x++) {
                    for (int y = 0; y < locations.getHeight(); y++) {
                        int valueAtLocation = locations.getLocationValue(x, y);

                        // select color for group --- max 5 different groups
                        if (valueAtLocation == 1) {
                            visualizationDrawer.setFill(Color.RED);
                        } else if (valueAtLocation == 2) {
                            visualizationDrawer.setFill(Color.BLUE);
                        } else if (valueAtLocation == 3) {
                            visualizationDrawer.setFill(Color.SANDYBROWN);
                        } else if (valueAtLocation == 4) {
                            visualizationDrawer.setFill(Color.GRAY);
                        } else if (valueAtLocation == 5) {
                            visualizationDrawer.setFill(Color.GREEN);
                        } else {
                            visualizationDrawer.setFill(Color.WHITE);
                        }

                        // draw rectangle representing single person
                        visualizationDrawer.fillRect(x * 5, y * 5, 5, 5);

                    }

                }

                // call update method
                model.update();

                // DO NOT CHANGE THIS
                prevTime = currentNanoTime;
            }
        }.start();

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
