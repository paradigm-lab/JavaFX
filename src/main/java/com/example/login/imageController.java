package com.example.login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class imageController {
    //ImageView is a Node used for painting images loaded with Images
    @FXML
    ImageView myimageView;
    @FXML
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("images/pic5.jpg"));

    @FXML
    public void displayImage() {
        myimageView.setImage(myImage);
    }
}
