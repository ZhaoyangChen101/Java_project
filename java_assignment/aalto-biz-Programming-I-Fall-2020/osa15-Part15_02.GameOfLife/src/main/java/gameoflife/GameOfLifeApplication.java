package gameoflife;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GameOfLifeApplication extends Application {

    public void start(Stage stage) {
        final int width = 800;
        final int height = 800;

        stage.setTitle("Game of Life");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Canvas background = new Canvas(width, height);
        root.getChildren().add(background);

        GraphicsContext animationDrawer = background.getGraphicsContext2D();

        GameOfLife gameOfLifeInstance = new GameOfLife(200, 200);
        gameOfLifeInstance.initializeWithRandomValues();

        new AnimationTimer() {
            // update the animation every 100 milliseconds
            private long sleepNanoseconds = 100 * 1000000;
            private long prevTime = 0;

            public void handle(long currentNanoTime) {
                //update the animation every 200 milliseconds
                if ((currentNanoTime - prevTime) < sleepNanoseconds) {
                    return;
                }

                // draw the background
                animationDrawer.setFill(Color.WHITE);
                animationDrawer.clearRect(0, 0, width, height);

                // draw the game
                animationDrawer.setFill(Color.BLACK);

                int[][] cellsToDraw = gameOfLifeInstance.getCells();
                for (int x = 0; x < cellsToDraw.length; x++) {
                    for (int y = 0; y < cellsToDraw[x].length; y++) {
                        if (cellsToDraw[x][y] == 1) {
                            animationDrawer.fillRect(x * 4, y * 4, 4, 4);
                        }
                    }
                }

                // call the evolve method
                gameOfLifeInstance.evolve();

                // DO NOT CHANGE
                prevTime = currentNanoTime;
            }
        }.start();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
