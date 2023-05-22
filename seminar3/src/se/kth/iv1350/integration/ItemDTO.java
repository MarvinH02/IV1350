package se.kth.iv1350.integration;
/**
 * This class represents an Item Data Transfer Object (DTO) that contains the necessary
 * information about an item for the sale process.
 */

public class ItemDTO {
    private String itemID;
    private double VATRate;
    private String itemName;
    private double itemPrice;

    /**
     * Constructs an ItemDTO object with the specified item details.
     *
     * @param itemID    The ID of the item.
     * @param VATRate   The VAT rate of the item.
     * @param itemPrice The price of the item.
     * @param itemName  The name of the item.
     */

    public ItemDTO(String itemID, double VATRate, double itemPrice, String itemName) {
        this.itemID = itemID;
        this.VATRate = VATRate;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    /**
     * Returns the ID of the item.
     *
     * @return The item ID.
     */
    public String getItemID(){

        return this.itemID;
    }

    /**
     * Returns the VAT rate applicable to the item.
     *
     * @return The VAT rate.
     */
    public double getVATRate(){
        return this.VATRate;
    }
    /**
     * Returns the name of the item.
     *
     * @return The item name.
     */
    public String getItemName(){

        return this.itemName;
    }

    /**
     * Returns the price of the item.
     *
     * @return The item price.
     */
    public double getItemPrice(){
        return this.itemPrice;
    }
}
