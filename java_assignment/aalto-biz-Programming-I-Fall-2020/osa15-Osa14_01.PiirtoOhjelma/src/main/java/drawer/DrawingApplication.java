package drawer;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DrawingApplication extends Application {

    public void start(Stage stage) {
        final int width = 640;
        final int height = 480;

        stage.setTitle("Drawing application");

        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Canvas drawingCanvas = new Canvas(width, height);
        root.getChildren().add(drawingCanvas);

        GraphicsContext drawer = drawingCanvas.getGraphicsContext2D();

        int[][] drawableArea = new int[width][height];

        scene.setOnMouseClicked((MouseEvent e) -> {
            // do something when the mouse is clicked
            int x = (int) e.getX();
            int y = (int) e.getY();
            
            // set the value 1 to the coordinates x, y
        });
        
        scene.setOnMouseDragged((MouseEvent e) -> {
            // do something when the mouse is held down and moved
            int x = (int) e.getX();
            int y = (int) e.getY();
            
            // set the value 1 to the coordinates x, y
        });

        new AnimationTimer() {
            public void handle(long currentNanoTime) {
                drawer.setFill(Color.WHITE);
                drawer.clearRect(0, 0, width, height);

                drawer.setFill(Color.BLACK);
                
                // the command
                // drawer.fillRect(x, y, 2, 2);
                // draws a 2 x 2 square at position x, y
                

                // implement here a repeat statement that goes through
                // the two-dimensional array, and draws for each element 
                // where the value is 1
                

            }
        }.start();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
