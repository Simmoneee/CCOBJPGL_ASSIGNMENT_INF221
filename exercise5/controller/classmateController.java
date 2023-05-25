package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class classmateController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5; 

    Justin justin = new Justin();
    Tim tim = new Tim();
    Josh josh= new Josh();
    Bea bea = new Bea();
    Lance lance = new Lance();

    public void initialize() {

        justin.setName("Yellow");
        justin.setGender("Very Sweet");

        tim.setName("Yellow");
        tim.setGender("Very Sweet");

        josh.setName("Yellow");
        josh.setGender("Very Sweet");

        bea.setName("Yellow");
        bea.setGender("Very Sweet");

        lance.setName("Red");
        lance.setGender("Sweet");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Hi i am justin");
        }

        if (sourceButton == btn2) {
            alert.setContentText("Hi i am bea");
        }
        
        if (sourceButton == btn3) {
            alert.setContentText("Hi i am lance");
       

        }
        if (sourceButton == btn4) {
            alert.setContentText("Hi i am tim");
     
    
        }
        if (sourceButton == btn5) {
            alert.setContentText("Hi i am josh");
        }

        alert.showAndWait();
    }
}