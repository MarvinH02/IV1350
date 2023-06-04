package se.kth.iv1350.view;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import se.kth.iv1350.model.SaleObserver;

public class TotalRevenueFileOutput implements SaleObserver {
    private PrintWriter file;
    private double totalRevenue;


    TotalRevenueFileOutput() {
       // totalRevenue = 0;
        try {
            file = new PrintWriter(new FileWriter("total-revenue.txt"), true);
        } catch (IOException excp) {
            System.out.println("Error occurred, could not create a logger");
            excp.printStackTrace();
        }
    }

    @Override
    public void startNewSale(double totalPrice) {
        totalRevenue += totalPrice;
        System.out.println("Total Revenue: " + totalRevenue);
        file.println("Total amount received: " + totalRevenue);


    }
}