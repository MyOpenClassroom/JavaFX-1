package msk.lab2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage stage;
    private AnchorPane anchorPane;

    @FXML
    private Button decideButton;

    @FXML
    private Button cleanOutButton;

    @FXML
    private Button exitButton;

    @FXML
    private TextField xTextField;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField resultTextField;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        this.anchorPane = FXMLLoader.load(getClass().getResource("main.fxml"));
        this.stage.setScene(new Scene(anchorPane));
        this.stage.setTitle("Создание простейшей визуальной программы на Java");
        this.stage.setResizable(false);
        this.stage.show();
    }

    @FXML
    public void decideButtonAction() {
        try {
            Double x = Double.parseDouble(xTextField.getText());
            Double a = Double.parseDouble(aTextField.getText());
            Double b = Double.parseDouble(bTextField.getText());

            if (x <= 7) {
                if (a == 0 && b == 0) {
                    resultTextField.setText("A и В не могут одновременно равняться нулю!");
                } else {
                    resultTextField.setText(String.valueOf((x + 4)/(a * a + b * b)));
                }
            } else {
                resultTextField.setText(String.valueOf(x*(a+b)*(a+b)));
            }
        } catch (Exception e) {
            resultTextField.setText("Введите корректные данные!");
        }
    }

    @FXML
    public void cleanOutButtonAction() {
        xTextField.setText("");
        aTextField.setText("");
        bTextField.setText("");
        resultTextField.setText("");
    }

    @FXML
    public void exitButtonAction() {
        this.stage = (Stage) exitButton.getScene().getWindow();
        this.stage.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
