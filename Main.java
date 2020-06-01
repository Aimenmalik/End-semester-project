package sample;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends Application{

    String UserId;
    String UserName;
    String password;

    int username_loop=0;
    int password_loop=0;

    Label lbl_Msg = new Label("Login to Continue");
    Button btn_login = new Button("LOGIN");
    Button btn_signUp = new Button("OR SIGN UP");

    TextField txt_userName = new TextField();

    PasswordField txt_password = new PasswordField();


    @Override
    public void start(Stage primaryStage) throws Exception {
        txt_userName.setMaxSize(150, 20);
        txt_password.setMaxSize(150, 20);

        HBox buttons=new HBox(5);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(btn_login, btn_signUp);
        VBox layout=new VBox(10);

        layout.getChildren().addAll(lbl_Msg, txt_userName, txt_password, buttons);
        layout.setAlignment(Pos.CENTER);

        Scene loginPane=new Scene(layout, 200, 200);
        primaryStage.setScene(loginPane);
        primaryStage.show();

        btn_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                try {
                    if(verifyLogin()==true && password_loop==username_loop){
                        txt_password.clear();
                        txt_userName.clear();
                        primaryStage.close();
                        ShoppingGUI shopping_obj = new ShoppingGUI();
                        shopping_obj.setGUI();

                    }
                    else{
                        lbl_Msg.setText("Either the username or password is incorrect. Try again:");
                        txt_password.clear();
                        txt_userName.clear();

                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });

        btn_signUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
            }
        });

    }

    public boolean verifyLogin() throws FileNotFoundException {

        if(verifyUserName() && verifyPassword())
            return true;
        else
            return false;
    }

    public boolean verifyPassword() throws FileNotFoundException{

        password_loop=0;
        UserFile userFile_Object=new UserFile();

        try {
            userFile_Object.writeFile("");
            Scanner readFile = new Scanner(userFile_Object.file);

            while (readFile.hasNext()) {
                password_loop++;

                UserId = readFile.next();
                UserName = readFile.next();
                password = readFile.next();

                if (password.equals(txt_password.getText())) {
                    return true;
                }

            }
        } catch(Exception e){}

        return false;
    }

    public boolean verifyUserName() throws FileNotFoundException {

        username_loop=0;
        UserFile userFile_Object=new UserFile();

        try {
            userFile_Object.writeFile("");
            Scanner readFile = new Scanner(userFile_Object.file);

            while (readFile.hasNext()) {

                username_loop++;
                UserId = readFile.next();
                UserName = readFile.next();
                password = readFile.next();

                if (UserName.equals(txt_userName.getText())) {
                    return true;
                }


            }
        }
        catch(Exception e){
        }

        return false;
    }


    public static void main(String[] args) {
        launch(args);
    }
}

