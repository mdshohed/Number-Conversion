package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utils.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ConversionController implements Initializable{

    public Label value_label;
    public Label convert_label;
    public Button btn_prev;

    @FXML
    private TextField converted_field;

    @FXML
    private TextField value_field;

    public String formlabel, tolabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void display(String formlabel, String tolabel){
        this.formlabel = formlabel;
        this.tolabel = tolabel;
        value_label.setText("Inter " + formlabel + " number");
        convert_label.setText(tolabel + " number");
    }

    @FXML
    void Convert(ActionEvent event) {
        String text = value_field.getText();
        if(text.equals("")) {
            converted_field.setText("");
        }
        else if(formlabel.equals("Binary") && tolabel.equals("Decimal")) {
            BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
            converted_field.setText(binaryToDecimal.binTodec(text));
        }

        else if (formlabel.equals("Binary") && tolabel.equals("Hexadecimal")){
            BinaryToHexadecimal binaryToHexadecimal = new BinaryToHexadecimal();
            converted_field.setText(binaryToHexadecimal.binTohex(text));
        }

        else if (formlabel.equals("Decimal") && tolabel.equals("Binary")){
            DecimalToBinary decimalToBinary = new DecimalToBinary();
            converted_field.setText(decimalToBinary.decTobin(text));
        }

        else if (formlabel.equals("Decimal") && tolabel.equals("Hexadecimal")){
            DecimalToHexadecimal decimalToHexadecimal = new DecimalToHexadecimal();
            converted_field.setText(decimalToHexadecimal.decTohex(text));
        }
        else if (formlabel.equals("Hexadecimal") && tolabel.equals("Binary")){
            HexadecimalToBinary hexadecimalToBinary = new HexadecimalToBinary();
            converted_field.setText(hexadecimalToBinary.hexTobin(text));

        }
        else if (formlabel.equals("Hexadecimal") && tolabel.equals("Decimal")){
            HexadecimalToDecimal hexadecimalToDecimal = new HexadecimalToDecimal();
            converted_field.setText(hexadecimalToDecimal.hexTodec(text));
        }
    }

    @FXML
    void Reset(ActionEvent event) {
        converted_field.setText("");
        value_field.setText("");
    }

    public void Previous(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)btn_prev.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        primaryStage.setTitle("Number Conversion");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }
}