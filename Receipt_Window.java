package sample;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt_Window {


    public static void display(){

        Stage receiptStage=new Stage();

        receiptStage.setTitle("Receipt");
        receiptStage.setHeight(500);
        receiptStage.setWidth(350);
        receiptStage.initModality(Modality.APPLICATION_MODAL);

        Label lbl_Receipt=new Label();
        lbl_Receipt.setPrefSize(300, 450);
        lbl_Receipt.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 11");

        Calendar time=Calendar.getInstance();
        time.getTime();
        SimpleDateFormat timeFormat=new SimpleDateFormat("HH:mm:ss");
        timeFormat.format(time.getTime());
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.format(time.getTime());

        ItemInfo price=new ItemInfo();

        lbl_Receipt.setText("\t\tOnline Grocery Store\n\n" + "Order ID:\t\t\n\n" + "*******************************************\n" +
                " NAME   \t"+" PRICE  \t"+"  QUANTITY\n\n"+ ((ShoppingGUI.cb1.isSelected() == true) ? ShoppingGUI.cb1.getText() + "  \t\tRs. " +price.ItemPrice[0] +"\t    x" + ShoppingGUI.txt1.getText() + "\n" : "") +
                (ShoppingGUI.cb2.isSelected() == true ? ShoppingGUI.cb2.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt2.getText() + "\n" : "") +
                (ShoppingGUI.cb3.isSelected() == true ? ShoppingGUI.cb3.getText() + "  \t\tRs. " +price.ItemPrice[2] +"\t    x" + ShoppingGUI.txt3.getText() + "\n" : "") +
                (ShoppingGUI.cb4.isSelected() == true ? ShoppingGUI.cb4.getText() + "  \t\tRs. " +price.ItemPrice[3] +"\t    x" + ShoppingGUI.txt4.getText() + "\n" : "") +
                (ShoppingGUI.cb5.isSelected() == true ? ShoppingGUI.cb5.getText() + "  \t\tRs. " +price.ItemPrice[4] +"\t    x" + ShoppingGUI.txt5.getText() + "\n" : "") +
                (ShoppingGUI.cb6.isSelected() == true ? ShoppingGUI.cb6.getText() + "  \t\tRs. " +price.ItemPrice[5] +"\t    x" + ShoppingGUI.txt6.getText() + "\n" : "") +
                (ShoppingGUI.cb7.isSelected() == true ? ShoppingGUI.cb7.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt7.getText() + "\n" : "") +
                (ShoppingGUI.cb8.isSelected() == true ? ShoppingGUI.cb8.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt8.getText() + "\n" : "") +
                (ShoppingGUI.cb9.isSelected() == true ? ShoppingGUI.cb9.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt9.getText() + "\n" : "") +
                (ShoppingGUI.cb10.isSelected() == true ? ShoppingGUI.cb10.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt10.getText() + "\n" : "") +
                (ShoppingGUI.cb11.isSelected() == true ? ShoppingGUI.cb11.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt11.getText() + "\n" : "") +
                (ShoppingGUI.cb12.isSelected() == true ? ShoppingGUI.cb12.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt12.getText() + "\n" : "") +
                (ShoppingGUI.cb13.isSelected() == true ? ShoppingGUI.cb13.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt13.getText() + "\n" : "") +
                (ShoppingGUI.cb14.isSelected() == true ? ShoppingGUI.cb14.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt14.getText() + "\n" : "") +
                (ShoppingGUI.cb15.isSelected() == true ? ShoppingGUI.cb15.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt15.getText() + "\n" : "") +
                (ShoppingGUI.cb16.isSelected() == true ? ShoppingGUI.cb16.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt16.getText() + "\n" : "") +
                (ShoppingGUI.cb17.isSelected() == true ? ShoppingGUI.cb17.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt17.getText() + "\n" : "") +
                (ShoppingGUI.cb18.isSelected() == true ? ShoppingGUI.cb18.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt18.getText() + "\n" : "") +
                (ShoppingGUI.cb19.isSelected() == true ? ShoppingGUI.cb19.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt19.getText() + "\n" : "") +
                (ShoppingGUI.cb20.isSelected() == true ? ShoppingGUI.cb20.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + ShoppingGUI.txt20.getText() + "\n" : "")
                + "\nTotal\t\t\t\t  " + ShoppingGUI.txtTotal.getText() +
                "\n\n*******************************************\n\n" + "Date:  " + dateFormat.format(time.getTime()) +
                "\t     Time:  "+timeFormat.format(time.getTime())
        );


        Button btn=new Button("CHECK OUT");
        btn.setOnAction(actionEvent -> System.exit(0));

        VBox vb=new VBox(10);
        vb.getChildren().addAll(lbl_Receipt, btn);
        vb.setPadding(new Insets(10));
        vb.setAlignment(Pos.CENTER);

        Scene scene=new Scene(vb);
        receiptStage.setScene(scene);
        receiptStage.showAndWait();


    }

}
