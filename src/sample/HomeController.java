package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable{

    @FXML
    public Label mylavel;
    public Label fromlabel;
    public Label tolabel;
    public Button btn_next;
    public Button btn_exit;

    @FXML
    public ChoiceBox<String> fromChoiseBox;
    @FXML
    public ChoiceBox<String> toChoiseBox;

    public String fromConversion = "", toConversion = "";

    private final String[] conversion = {"Binary", "Decimal", "Hexadecimal"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fromChoiseBox.getItems().addAll(conversion);
        fromChoiseBox.setOnAction(this::getConversion);
        toChoiseBox.getItems().addAll(conversion);
        toChoiseBox.setOnAction(this::getConversion2);
    }

    private void getConversion(javafx.event.ActionEvent actionEvent) {
        fromConversion = fromChoiseBox.getValue();
        fromlabel.setText(fromConversion);
    }

    private void getConversion2(javafx.event.ActionEvent actionEvent) {
        toConversion = toChoiseBox.getValue();
        tolabel.setText(toConversion);
    }

    public void Exit(ActionEvent actionEvent){
        Stage stage = (Stage) btn_exit.getScene().getWindow();
        stage.close();
    }

    public void Next(ActionEvent actionEvent) throws IOException {
        if(fromConversion.equals("") || toConversion.equals("")) {
            CommonTask.showAlert(Alert.AlertType.CONFIRMATION, "Select Option!", "Please Select Option form select box");
        }
        else if(fromConversion.equals(toConversion)) {
            CommonTask.showAlert(Alert.AlertType.ERROR, "Select Another!", "Please Select different Option form select box");
        }
        else {
            Stage stage = (Stage) btn_next.getScene().getWindow();
            stage.close();
            CommonTask.Conversionpage("Conversion.fxml",null,this.getClass(),"Conversion", 700, 400, fromConversion, toConversion);
        }
    }
}
