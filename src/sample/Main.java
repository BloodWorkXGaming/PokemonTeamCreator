package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("PokemonTeamCreator");
        Scene scene = new Scene(root, 540 * 0.8, 960*0.8);
        scene.getStylesheets().add("resources/Styles.css");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);

        primaryStage.setMinWidth(540 / 2);
        primaryStage.setMinHeight(960 / 2);
        primaryStage.setMaxWidth(540);
        primaryStage.setMaxHeight(960);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
