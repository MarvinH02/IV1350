package se.kth.iv1350.model;
import se.kth.iv1350.model.*;
import se.kth.iv1350.integration.*;
import se.kth.iv1350.model.*;


import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Sale is that class that handles all the logic when scanning items and adding items.
 */

public class Sale {
    private int totalAmount;
    private java.time.LocalDate saleDate;
    private int VAT;
    private ExternalInventorySystem EI;

    private ArrayList<Item> items = new ArrayList<>();
    private se.kth.iv1350.integration.ItemDTO ItemDTO;
    /**
     * Constructor for creating a new Sale object
     */
    public Sale() {
        saleDate = LocalDate.now();

    }
    /**
     * Returns the total amount for the sale
     * @return the total amount for the sale
     */


    public int getToTalAmount() {
        return totalAmount;
    }
    /**
     * Updates the total amount for the sale
     */


    public void uppdateTotal() {
        totalAmount = 0;
        for (Item item : items) {
            totalAmount += item.getQuantity() * item.getItemPrice() * item.getVAT();
            // VAT = items.getVAT()*items.getItemPrice()*items.getQuantity()
            totalAmount = this.totalAmount;

        }

    }
    /**
     * Adds an item to the sale
     * @param ItemID the ID of the item to add
     * @param Quantiy the quantity of the item to add
     */
    public void addsToSale(String ItemID, int Quantiy){
       while (EI.isValid(ItemID) != null){
           for (Item item: items){
               if (item.getItemID().equals(ItemID)){
                   item.incrementQuantity();
               }
               System.out.println(item.getQuantity());
           }

       }

    }
    /**
     * Checks if an item has been scanned
     * @param itemId the ID of the item to check
     * @return true if the item has been scanned, otherwise false
     */

    public boolean isScanned(String itemId) {
        for (Item item : items) {
            if (item.getItemID().equals(itemId)) {
                // items.incrementQuantity();
                return true;
            }
        }
        return false;
    }
    /**
     * Increases the quantity of an item by 1
     * @param itemId the ID of the item to increase the quantity of
     * @return a SaleDTO object with updated information
     */

    public SaleDTO incrementItemQuantity(String itemId) {
        // quantity = 1;
        for (Item item : items) {
            if (item.getItemID().equals(itemId)) {
                item.incrementQuantity();
                //System.out.println(item.getItemID() + item.getQuantity());
            }

        }
        return new SaleDTO(this.VAT, this.items, this.saleDate, this.totalAmount);

    }
    /**
     * Returns a SaleDTO object with information about the sale
     * @return a SaleDTO object with information about the sale
     */
    public SaleDTO getSaleDTO() {
        SaleDTO currentSale = new SaleDTO(this.VAT, this.items, this.saleDate, this.totalAmount);
        return currentSale;
    }
    /**
     * Ends the sale and generates a Receipt object
     * @param saleDTO the SaleDTO object containing information about the sale
     * @param payment the Payment object containing information about the payment
     * @return a Receipt object containing information about the sale and payment
     */

    public Receipt endsSale(SaleDTO saleDTO, Payment payment) {
        return new Receipt(saleDTO, payment);
    }

    /**
     * Calculates and returns the running total for the sale
     * @return the running total for the sale
     */
    public double runningTotal() {
        int runningTotal = 0;
        for (Item item : items) {
            runningTotal += item.getQuantity() * item.getItemPrice()*item.getVAT();
        }
        this.totalAmount = runningTotal;
        return runningTotal;

    }

    /**
     * gets the amount of running total
     * @return the running total of the current sale
     */
    public double getAmount() {

        return this.runningTotal();
    }

    /**
     * gets the date of the sale
     * @return the saleDate
     */
    public LocalDate getSaleDate() {
        return saleDate;
    }
    /**
     * Returns the list of items in the current sale.
     * @return the list of items in the current sale
     */

    public ArrayList<Item> getItems() {
        return items;
    }



}
