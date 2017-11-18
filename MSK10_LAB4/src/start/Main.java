package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
    private Stage stage;
    private AnchorPane anchorPane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        this.anchorPane = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        this.stage.setScene(new Scene(this.anchorPane));
        this.stage.setTitle("Работа со строками в Java");
        this.stage.setResizable(false);
        stage.getIcons().add(new Image("/images/logo.png"));
        this.stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
