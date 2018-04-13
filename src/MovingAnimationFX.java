import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
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

        Circle cir = new Circle();
        cir.setFill(Color.RED);
        cir.setRadius(30);
        cir.setLayoutX(50);
        cir.setLayoutY(50);

        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(3));//Hvor lang tid den tager at køre derned..
        transition.setToX(500);
        transition.setToY(500);
        transition.setNode(cir);
        transition.play();

        Pane root = new Pane();

        root.getChildren().add(cir);//Her tilføjer jeg node.

        Scene scene = new Scene(root, 600,600);
        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
