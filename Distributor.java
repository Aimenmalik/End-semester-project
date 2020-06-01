package sample;

public class Distributor {
    public double[] cost =new double[10];
    public double totalAmount=0;

    public double getTotal(){

        for(int i = 0; i<= 5; i++){

            totalAmount = totalAmount + cost[i];
        }

        return totalAmount;
    }
}
