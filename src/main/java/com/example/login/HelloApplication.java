package com.example.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class HelloApplication extends Application {

    public void logout(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before exiting?: ");

        if(alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You successfully logged out!");
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        try {
            //URL url = new File("src/main/resources/com/example/fxmlLogin/fxml/imageScene.fxml").toURI().toURL();
            /*
            * The root object is where the exception is coming from
             */
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("/fxml/imageScene.fxml")));
            //Parent root = FXMLLoader.load(url);
            stage.setTitle("Hello World");
            stage.setScene(new Scene(root));
            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            // Setting up the css file
            //String css = this.getClass().getResource("application.css").toExternalForm();
            //scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.show();

            /*
            stage.setOnCloseRequest(event -> {
                event.consume();
                logout(stage);
            });
            */
        }
        catch (Exception e){
            System.out.println("Exception on FXMLLoader.load()");
            System.out.println(e.getMessage() );
            //e.printStackTrace();
        }

    }
}