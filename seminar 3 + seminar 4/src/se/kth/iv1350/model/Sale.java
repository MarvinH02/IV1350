package se.kth.iv1350.model;

import se.kth.iv1350.model.*;
import se.kth.iv1350.integration.*;
import se.kth.iv1350.model.*;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * The Sale class represents a sale transaction.
 */

public class Sale {
    private double fullPrice;
    private Payment payment;
    private double VATTot;
    private ArrayList<Item> items = new ArrayList<>();
    private List <SaleObserver> saleObservers = new ArrayList<>();

    /**
     * Adds an item to the sale.
     *
     * @param scannedItem The ItemDTO object representing the scanned item.
     * @return The SaleDTO object containing the updated sale information.
     */

    public SaleDTO addItem(ItemDTO scannedItem){
        boolean itemFound = false;
        for(Item item : items){
            if(item.getItemID().equals(scannedItem.getItemID())) {
                itemFound = true;
                item.incrementItemQuantity ();
                break;
            }
        }
        if(!itemFound) {
            Item item = new Item(scannedItem);
            items.add(item);
        }
        updateTotal();
        return new SaleDTO(items, this.fullPrice,this.VATTot);
    }
    /**
     * Retrieves the total price of the sale.
     *
     * @return The total price of the sale.
     */

    public double getFullPrice(){
        return fullPrice;


    }

    /**
     * Retrieves the total number of items scanned in the sale.
     *
     * @return The total number of items scanned.
     */

    public int getScannedItemCount() {
        int itemCount = 0;
        for (Item item : items) {

                itemCount += item.getQuantity();
            }
        return itemCount;
    }
    /**
     * Retrieves the total VAT amount of the sale.
     *
     * @return The total VAT amount of the sale.
     */
    public double getVATTot() {

        return VATTot;
    }
    /**
     * Processes the payment for the sale.
     *
     * @param amount The amount paid by the customer.
     */
    public void pay(double amount){

        payment = new Payment();
        payment.pay(amount);
        notifyObserver();

    }

    /**
     * Updates the total price and VAT amount of the sale based on the items added.
     */
    public void updateTotal() {
        VATTot = 0;
        double runningTotal = 0;

        for (Item item : items) {
            runningTotal += item.getItemPrice() * item.getQuantity();
            VATTot += item.getVAT() * item.getItemPrice() * item.getQuantity();

        }

        this.VATTot = VATTot;
        this.fullPrice = runningTotal + VATTot;


    }
    private void notifyObserver(){
        for (SaleObserver saleObserver : saleObservers){
            saleObserver.startNewSale(fullPrice);

        }

    }
    /**
     * Adds a SaleObserver to the sale.
     *
     * @param saleObserver The SaleObserver object to be added.
     */
    public void addsToSaleObserver(SaleObserver saleObserver){

        saleObservers.add(saleObserver);
    }
}