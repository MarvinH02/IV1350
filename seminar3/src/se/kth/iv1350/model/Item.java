package se.kth.iv1350.model;

import se.kth.iv1350.integration.ItemDTO;
/**
 * The Item class represents an item in the sale.
 */

public class Item {
    private String ItemID;
    private double ItemPrice;
    private int quantity;
    private double VAT;
    private String name;

    /**
     * Constructs an Item object based on the provided ItemDTO object.
     *
     * @param item The ItemDTO object containing the item information.
     */

    public Item (ItemDTO item){
        this.ItemID = item.getItemID();
        this.name = item.getItemName();
        this.VAT = item.getVATRate();
        this.ItemPrice = item.getItemPrice();
        this.quantity = 1;


    }
    /**
     * Increments the quantity of the item by 1.
     */
    public void incrementItemQuantity(){

        quantity += 1;
    }
    /**
     * Returns the item ID.
     *
     * @return The item ID.
     */
    public String getItemID() {

        return this.ItemID;
    }

    /**
     * Returns the item name.
     *
     * @return The item name.
     */

    public String getName(){

        return this.name;
    }
    /**
     * Returns the VAT rate of the item.
     *
     * @return The VAT rate of the item.
     */

    public double getVAT(){

        return this.VAT;
    }
    /**
     * Returns the price of the item.
     *
     * @return The price of the item.
     */

    public double getItemPrice(){

        return this.ItemPrice;
    }

    /**
     * Returns the quantity of the item.
     *
     * @return The quantity of the item.
     */
    public int getQuantity(){

        return this.quantity;
    }
}
