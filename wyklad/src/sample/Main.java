package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;
    Scene scene1,scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Dzien dobry");

        Label label1 = new Label("Witam na wykladzie");
        button = new Button("Przejdz do innego okna");
        button.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button);
        scene1 = new Scene(layout1, 400, 200);

        Button button2 = new Button("Wroc do poprz okna");
        button2.setOnAction(e -> window.setScene(scene1)); /*{
            @Override
            public void handle(ActionEvent actionEvent) {
                window.setScene(scene1);
            }
        });*/

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);

        window.show();
    }

    private void set(){
        window.setScene(scene1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}