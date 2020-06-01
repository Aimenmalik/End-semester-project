package sample;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Signup_Window {
    public static void signupRecords(){

        //Adding Stages
        Stage signUpStage=new Stage();

        signUpStage.setTitle("SIGN UP");
        signUpStage.setHeight(500);
        signUpStage.setWidth(350);

         //Adding Labels

        Label lbl_Username=new Label( " Username");
        lbl_Username.setPrefSize(300, 450);
        lbl_Username.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 11");

        Label lbl_Password=new Label(" Password");
        lbl_Password.setPrefSize(300, 450);
        lbl_Password.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 11");

        Label lbl_Email=new Label("Email");
        lbl_Email.setPrefSize(300, 450);
        lbl_Email.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 11");

        //Adding Button

        Button btn_Confirm=new Button("Confirm");
         btn_Confirm.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px;");
         btn_Confirm.setPrefWidth(100);

        //Adding Text fields


        TextField txtUS=new TextField("username");
        txtUS.setPrefWidth(100);
        txtUS.setPrefHeight(20);
        txtUS.setDisable(true);

        TextField txtPS=new TextField("password");
        txtPS.setPrefWidth(100);
        txtPS.setPrefHeight(20);
        txtPS.setDisable(true);
        //Adding textfield for email

        TextField txtEM=new TextField("email");
        txtEM.setPrefWidth(100);
        txtEM.setPrefHeight(20);
        txtEM.setDisable(true);



    }

}
