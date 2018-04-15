package javafxAnimationFun;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MovingAnimationFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        Scene scene = new Scene(root, 600,600);
        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();

        Circle cir = new Circle();
        cir.setFill(Color.RED);
        cir.setRadius(10);
        cir.setLayoutX(60);
        cir.setLayoutY(60);

        TranslateTransition transition = new TranslateTransition();
       //On key press ryk cir derhen
        /* scene.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.K){

                transition.setDuration(Duration.seconds(3));//Hvor lang tid den tager at køre derned..
                transition.setToX(300);
                transition.setToY(300);
                transition.setNode(cir);
                transition.play();
            }
        });
*/

        //Kører derhen hvor du trykker med musen
        /*scene.setOnMouseClicked(event -> {
            if(event.getButton()== MouseButton.PRIMARY){
                transition.setDuration(Duration.seconds(1));//Hvor lang tid den tager at køre derned..
                transition.setToX(event.getX());
                transition.setToY(event.getY());
                transition.setNode(cir);
                transition.play();
            }

        });*/

        scene.setOnMouseDragged(event -> {
            if(event.isPrimaryButtonDown()){
                transition.setDuration(Duration.millis(1));//Hvor lang tid den tager at køre derned..
                transition.setToX(event.getSceneX()-60);
                transition.setToY(event.getSceneY()-60);
                transition.setNode(cir);
                transition.play();

            }

        });

        root.getChildren().add(cir);//Her tilføjer jeg node.


    }
}
