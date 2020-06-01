package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ShoppingGUI {
    double totalCost;
    int timePressed=0;

    //adding HBox
    HBox hb_Container=new HBox();
    HBox hb_Buttons =new HBox();
    HBox hb_Items1 =new HBox();
    HBox hb_Items2=new HBox();
    HBox hb_Items3=new HBox();

    //Adding Buttons
    Button btn_Exit=new Button("Exit");
    Button btn_Total=new Button("Total");
    Button btn_Reset=new Button("Reset");
    Button btn_Receipt=new Button("Receipt");

    //Adding Check Boxes
    static CheckBox cb1=new CheckBox("Oil/litre");
    static CheckBox cb2=new CheckBox("Pasta");
    static CheckBox cb3=new CheckBox("Rice/kg");
    static CheckBox cb4=new CheckBox("Bread");
    static CheckBox cb5=new CheckBox("Flour/kg");
    static CheckBox cb6=new CheckBox("Butter/200g");
    static CheckBox cb7=new CheckBox("Milk/litre");
    static CheckBox cb8=new CheckBox("Eggs/12");
    static CheckBox cb9=new CheckBox("Cheese/500g");
    static CheckBox cb10=new CheckBox("Onions/kg");
    static CheckBox cb11=new CheckBox("Garlic/250g");
    static CheckBox cb12=new CheckBox("Pulses/kg");
    static CheckBox cb13=new CheckBox("Salt/kg");
    static CheckBox cb14=new CheckBox("Sugar/kg");
    static CheckBox cb15=new CheckBox("Honey/200ml");
    static CheckBox cb16=new CheckBox("Vinegar/litre");
    static CheckBox cb17=new CheckBox("Cereal");
    static CheckBox cb18=new CheckBox("Fish/kg");
    static CheckBox cb19=new CheckBox("Mutton/kg");
    static CheckBox cb20=new CheckBox("Beef/kg");

    //Adding Text Fields
    static TextField txt1=new TextField("0");
    static TextField txt2=new TextField("0");
    static TextField txt3=new TextField("0");
    static TextField txt4=new TextField("0");
    static TextField txt5=new TextField("0");
    static TextField txt6=new TextField("0");
    static TextField txt7=new TextField("0");
    static TextField txt8=new TextField("0");
    static TextField txt9=new TextField("0");
    static TextField txt10=new TextField("0");
    static TextField txt11=new TextField("0");
    static TextField txt12=new TextField("0");
    static TextField txt13=new TextField("0");
    static TextField txt14=new TextField("0");
    static TextField txt15=new TextField("0");
    static TextField txt16=new TextField("0");
    static TextField txt17=new TextField("0");
    static TextField txt18=new TextField("0");
    static TextField txt19=new TextField("0");
    static TextField txt20=new TextField("0");

    static TextField txtTotal=new TextField();


    Label lbl_Title=new Label("    Online Grocery Store    ");
    Label lbl_Item=new Label("Item");
    Label lbl_Quantity=new Label("Quantity");

    VBox vb_Items1 =new VBox();
    VBox vb_Items2=new VBox();
    VBox vb_Inputs1 =new VBox();
    VBox vb_Inputs2=new VBox();

    BorderPane a=new BorderPane();
    BorderPane b=new BorderPane();

    SplitPane root=new SplitPane(a, b);

    Scene shoppingScene;

    Stage window=new Stage();

    public void setGUI(){
        window.setTitle("Grocery Store");
        window.setHeight(700);
        window.setWidth(1300);


        //Set Buttons
        setButtons();

        //Set HBox
        setHBox();

        //set Check Boxes
        setCheckBoxes_and_TextFields(cb1, txt1);
        setCheckBoxes_and_TextFields(cb2, txt2);
        setCheckBoxes_and_TextFields(cb3, txt3);
        setCheckBoxes_and_TextFields(cb4, txt4);
        setCheckBoxes_and_TextFields(cb5, txt5);
        setCheckBoxes_and_TextFields(cb6, txt6);
        setCheckBoxes_and_TextFields(cb7, txt7);
        setCheckBoxes_and_TextFields(cb8, txt8);
        setCheckBoxes_and_TextFields(cb9, txt9);
        setCheckBoxes_and_TextFields(cb10, txt10);
        setCheckBoxes_and_TextFields(cb11, txt11);
        setCheckBoxes_and_TextFields(cb12, txt12);
        setCheckBoxes_and_TextFields(cb13, txt13);
        setCheckBoxes_and_TextFields(cb14, txt14);
        setCheckBoxes_and_TextFields(cb15, txt15);
        setCheckBoxes_and_TextFields(cb16, txt16);
        setCheckBoxes_and_TextFields(cb17, txt17);
        setCheckBoxes_and_TextFields(cb18, txt18);
        setCheckBoxes_and_TextFields(cb19, txt19);
        setCheckBoxes_and_TextFields(cb20, txt20);

        //Set Label
        setLabels();

        //set VBox
        setVBox();

        //Set panes
        setPanes();

        //add widgets
        addWidgets();

        //Actions
        ActionPerformed_Buttons();
        ActionPerformed_CheckBoxes();


        shoppingScene=new Scene(root, 1300, 700);
        window.setScene(shoppingScene);

        //primaryStage.setScene(shoppingScene);

        window.show();
    }

    public void setButtons(){
        btn_Exit.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px;");
        btn_Exit.setPrefWidth(100);
        btn_Total.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px; ");
        btn_Total.setPrefWidth(100);
        btn_Reset.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px;");
        btn_Reset.setPrefWidth(100);
        btn_Receipt.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px;");
        btn_Receipt.setPrefWidth(100);
        btn_Receipt.setDisable(true);
    }

    public void setCheckBoxes_and_TextFields(CheckBox cb, TextField txt){

        cb.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb.setPrefWidth(100);
        cb.setPrefHeight(20);

        txt.setPrefWidth(100);
        txt.setPrefHeight(20);
        txt.setDisable(true);
    }

    public void setLabels(){
        lbl_Title.setAlignment(Pos.TOP_CENTER);
        lbl_Title.setFont(new Font("Times New Roman", 50));
        lbl_Title.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: darkgray; -fx-border-width: 5");

        lbl_Item.setFont(new Font("Times New Roman", 20));
        lbl_Item.setStyle("-fx-font-weight: bold");

        lbl_Quantity.setFont(new Font("Times New Roman", 20));
        lbl_Quantity.setStyle("-fx-font-weight: bold; -fx-wrap-text: true");
        lbl_Quantity.setPrefWidth(100);
    }

    public void setHBox(){

        hb_Container.setPadding(new Insets(10));
        hb_Container.setSpacing(7);
        hb_Container.setPrefHeight(400);
        hb_Container.setPrefWidth(1250);


        hb_Items3.setPadding(new Insets(10));
        hb_Items3.setSpacing(1);
        hb_Items3.setPrefHeight(400);
        hb_Items3.setPrefWidth(400);
        hb_Items3.setStyle("-fx-border-color: darkgray; -fx-border-width: 5;");

        hb_Items1.setPadding(new Insets(10));
        hb_Items1.setSpacing(1);
        hb_Items1.setPrefHeight(400);
        hb_Items1.setPrefWidth(400);
        hb_Items1.setStyle("-fx-border-color: darkgray; -fx-border-width: 5;");

        hb_Items2.setPadding(new Insets(10));
        hb_Items2.setSpacing(1);
        hb_Items2.setPrefHeight(400);
        hb_Items2.setPrefWidth(400);
        hb_Items2.setStyle("-fx-border-color: darkgray; -fx-border-width: 5;");

        hb_Buttons.setAlignment(Pos.BOTTOM_LEFT);
        hb_Buttons.setPrefWidth(450);
        hb_Buttons.setPrefHeight(50);
        hb_Buttons.setPadding(new Insets(10, 10, 10, 10));
        hb_Buttons.setStyle("-fx-border-color: darkgray; -fx-border-width: 5;");
        hb_Buttons.setSpacing(50);

    }

    public void setVBox(){
        //setting vb_Items
        vb_Items1.setAlignment(Pos.CENTER_LEFT);
        vb_Items1.setPrefHeight(400);
        vb_Items1.setPrefWidth(400);
        vb_Items1.setSpacing(10);
        vb_Items1.setPadding(new Insets(10));

        vb_Items2.setAlignment(Pos.CENTER_LEFT);
        vb_Items2.setPrefHeight(400);
        vb_Items2.setPrefWidth(400);
        vb_Items2.setSpacing(10);
        vb_Items2.setPadding(new Insets(10));

        //Setting vb_Inputs
        vb_Inputs1.setAlignment(Pos.CENTER_RIGHT);
        vb_Inputs1.setPrefHeight(400);
        vb_Inputs1.setPrefWidth(250);
        vb_Inputs1.setSpacing(6);
        vb_Inputs1.setPadding(new Insets(10));

        vb_Inputs2.setAlignment(Pos.CENTER_RIGHT);
        vb_Inputs2.setPrefHeight(400);
        vb_Inputs2.setPrefWidth(250);
        vb_Inputs2.setSpacing(6);
        vb_Inputs2.setPadding(new Insets(10));
    }

    public void setPanes(){
        a.setPrefSize(400, 600);
        b.setPrefSize(500, 600);
        root.setDividerPositions(0.058);
        root.setOrientation(Orientation.VERTICAL);
        root.setPadding(new Insets(10));
        a.setNodeOrientation(NodeOrientation.INHERIT);
        b.setNodeOrientation(NodeOrientation.INHERIT);

    }

    public void addWidgets(){
        hb_Buttons.getChildren().addAll(btn_Total, btn_Reset, btn_Receipt, btn_Exit);

        vb_Inputs1.getChildren().addAll(lbl_Quantity, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10);
        vb_Items1.getChildren().addAll(lbl_Item, cb1, cb2,cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10);
        vb_Items2.getChildren().addAll(lbl_Item, cb11, cb12, cb13, cb14, cb15, cb16, cb17, cb18, cb19, cb20);
        vb_Inputs2.getChildren().addAll(lbl_Quantity, txt11, txt12, txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20);

        hb_Items1.getChildren().addAll(vb_Items1, vb_Inputs1);
        hb_Items2.getChildren().addAll(vb_Items2, vb_Inputs2);

        hb_Container.getChildren().addAll(hb_Items1, hb_Items2, hb_Items3);

        a.setTop(lbl_Title);
        b.setCenter(hb_Container);
        b.setBottom(hb_Buttons);

    }

    public void ActionPerformed_Buttons(){

        ItemInfo itemCost=new ItemInfo();

        btn_Exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        btn_Reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                resetAction(txt1, cb1);
                resetAction(txt2, cb2);
                resetAction(txt3, cb3);
                resetAction(txt4, cb4);
                resetAction(txt5, cb5);
                resetAction(txt6, cb6);
                resetAction(txt7, cb7);
                resetAction(txt8, cb8);
                resetAction(txt9, cb9);
                resetAction(txt10, cb10);
                resetAction(txt11, cb11);
                resetAction(txt12, cb12);
                resetAction(txt13, cb13);
                resetAction(txt14, cb14);
                resetAction(txt15, cb15);
                resetAction(txt16, cb16);
                resetAction(txt17, cb17);
                resetAction(txt18, cb18);
                resetAction(txt19, cb19);
                resetAction(txt20, cb20);
                totalCost=0;
                itemCost.totalAmount=0;

                for (int i=0; i<=5; i++){
                    itemCost.cost[i]=0;
                }
            }
        });


        btn_Total.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timePressed++;
                double previousAmount=totalCost;
                itemCost.cost[0]=itemCost.ItemPrice[0] * Double.parseDouble(txt1.getText());
                itemCost.cost[1]=itemCost.ItemPrice[1] * Double.parseDouble(txt2.getText());
                itemCost.cost[2]=itemCost.ItemPrice[2] * Double.parseDouble(txt3.getText());
                itemCost.cost[3]=itemCost.ItemPrice[3] * Double.parseDouble(txt4.getText());
                itemCost.cost[4]=itemCost.ItemPrice[4] * Double.parseDouble(txt5.getText());
                itemCost.cost[5]=itemCost.ItemPrice[5] * Double.parseDouble(txt6.getText());

                totalCost=itemCost.getTotal();

                if(timePressed==0){
                    txtTotal.setText("Rs. "+String.valueOf(totalCost));
                }

                else
                    txtTotal.setText("Rs. "+String.valueOf(totalCost-previousAmount));
            }
        });

        btn_Receipt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Receipt_Window.display();

            }
        });
    }

    public void resetAction(TextField txt, CheckBox cb){
        txt.setText("0");
        txt.setDisable(true);
        cb.setSelected(false);
        txtTotal.clear();
    }

    public void checkbox_Disable(TextField txt, CheckBox cb){
        if(cb.isSelected()==true){
            txt.setDisable(false);
            btn_Receipt.setDisable(false);
        }

        else {
            txt.setDisable(true);
            txt.setText("0");
            if(cb1.isSelected() || cb2.isSelected() || cb3.isSelected() || cb4.isSelected() || cb5.isSelected() || cb6.isSelected() || cb7.isSelected() || cb8.isSelected() || cb9.isSelected() || cb10.isSelected()||cb11.isSelected()||cb12.isSelected()||cb13.isSelected()||cb14.isSelected()||cb15.isSelected()||cb16.isSelected()||cb17.isSelected()||cb18.isSelected()||cb19.isSelected()||cb20.isSelected())
                btn_Receipt.setDisable(false);
            else
                btn_Receipt.setDisable(true);

        }
    }

    public void ActionPerformed_CheckBoxes(){

        cb1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt1, cb1);
            }
        });

        cb2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt2, cb2);
            }
        });

        cb3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt3, cb3);
            }
        });

        cb4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt4, cb4);
            }
        });

        cb5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt5, cb5);
            }
        });

        cb6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt6, cb6);
            }
        });

        cb7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt7, cb7);
            }
        });
        cb8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt8, cb8);
            }
        });
        cb9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt9, cb9);
            }
        });
        cb10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt10, cb10);
            }
        });
        cb11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt11, cb11);
            }
        });
        cb12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt12, cb12);
            }
        });
        cb13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt13, cb13);
            }
        });
        cb14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt14, cb14);
            }
        });
        cb15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt15, cb15);
            }
        });
        cb16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt16, cb16);
            }
        });
        cb17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt17, cb17);
            }
        });
        cb18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt18, cb18);
            }
        });
        cb19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt19, cb19);
            }
        });
        cb20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt20, cb20);
            }
        });
    }


}
