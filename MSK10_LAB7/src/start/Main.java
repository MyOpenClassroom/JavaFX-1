package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        stage.setScene(new Scene(anchorPane));
        stage.setResizable(false);
        stage.setTitle("Работа с animation в JavaFX");
        stage.getIcons().add(new Image("/images/logo.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
