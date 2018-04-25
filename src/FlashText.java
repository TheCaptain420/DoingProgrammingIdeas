import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FlashText extends Application{
    private String text = " ";

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Label lbltext = new Label("Hello world");
        pane.getChildren().add(lbltext);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while(true){
                        if(lbltext.getText().trim().length()==0){
                            text="Reee";
                        }else{
                            text ="";
                        }
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lbltext.setText(text);
                            }
                        });
                        Thread.sleep(200);
                    }

                }catch (InterruptedException ex){

                }
            }
        }).start();
        Scene scene = new Scene(pane,200,50);
        primaryStage.setTitle("ARHHHH");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
