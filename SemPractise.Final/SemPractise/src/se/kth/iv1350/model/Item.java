package se.kth.iv1350.model;

import se.kth.iv1350.integration.ItemDTO;
/**
 * This class represents the item that is scanned.
 */

public class Item {
    private int quantity;
    private String itemID;
    private double itemPrice;
    private int VAT;
    private String name;


    /**
     * Creates an instance of an item.
     *
     * @param itemID the identifier for the item.
     * @param name the name of the item.
     * @param VAT the VAT for the item.
     * @param itemPrice the price of the item.
     * @param quantity the quantity of the item.
     */
    public Item (String itemID, String name,int VAT, double itemPrice, int quantity){
        this.itemPrice = itemPrice;
        this.VAT = VAT;
        this.name = name;
        this.quantity = quantity;
        this.itemID = itemID;

    }
    /**
     * Returns the name of the item.
     * @return the name of the item.
     */

    public String getName() {
        return this.name;
    }
    /**
     * Returns the VAT for the item.
     *
     * @return the VAT for the item.
     */
    public int getVAT() {
        return this.VAT;
    }
    /**
     * Returns the quantity of the item.
     *
     * @return the quantity of the item.
     */

    public int getQuantity() {
        return this.quantity;
    }
    /**
     * Sets the quantity of the item.
     * it was later realised that it was not necessary to have a setquantity method
     * all we wanted this method to do was that we could manually enter the amount of
     * @param quantity the quantity of the item.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /**
     * Returns the price of the item.
     * @return the price of the item.
     */
    public double getItemPrice() {
        return this.itemPrice;
    }

    /**
     * Increments the quantity of the item.
     */
    public int incrementQuantity (){
        return this.quantity+=1;
    }
    /**
     * Returns the identifier for the item.
     * @return the identifier for the item.
     */
    public String getItemID() {
        return itemID;
    }
}
