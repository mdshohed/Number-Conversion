package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class CommonTask {
    public static void Conversionpage(String path, Stage stage, Class<?> classes, String title, int width, int height,String form,String to ) throws IOException {
        if (stage == null){
            stage = new Stage();
        }
        FXMLLoader loader = new FXMLLoader(classes.getResource(path));
        Parent root = loader.load();
        ConversionController conversionController = loader.getController();
        conversionController.display(form, to);
        stage.setTitle(title);
        stage.setScene(new Scene(root, width, height));
        stage.show();
    }

    public static void showAlert(Alert.AlertType type, String title, String message){
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.show();
    }
}
