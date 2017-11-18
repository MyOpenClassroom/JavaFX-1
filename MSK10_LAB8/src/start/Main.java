package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage stage;

    public Stage getStage() {
        return stage;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent parent = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        stage.setScene(new Scene(parent));
        stage.setTitle("Работа с массивами и файлами");
        stage.setResizable(false);
        stage.getIcons().add(new Image("/images/logo.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
