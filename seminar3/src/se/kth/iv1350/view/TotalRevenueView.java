package se.kth.iv1350.view;
import se.kth.iv1350.model.SaleObserver;

import java.io.PrintWriter;

 class TotalRevenueView implements SaleObserver {

     private double totalAmountReceived;

     TotalRevenueView(){
         totalAmountReceived = 0;
     }


     public void startNewSale(double totalPrice) {
         totalAmountReceived += totalPrice;

         System.out.println("Total Revenue:" + totalAmountReceived);

     }
 }