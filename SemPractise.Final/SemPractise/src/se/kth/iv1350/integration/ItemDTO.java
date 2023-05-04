package se.kth.iv1350.integration;
/**
 * This class represents an Item Data Transfer Object (DTO) that contains the necessary
 * information about an item for the sale process.
 */

public class ItemDTO {

        private double price;
        private String itemID;
        private int VAT;
        private String Name;

        private int quantity;


    /**
     *Creates a new instance of ItemDTO with the given information.
     * @param price The price of the item.
     * @param itemID The unique identifier of the item.
     * @param VAT The Value Added Tax (VAT) percentage of the item.
     * @param quantity The quantity of the item.
     * @param name The name of the item.
     */

        public ItemDTO(double price, String itemID, int VAT,int quantity, String name) {
            this.price = price;
            this.itemID = itemID;
            this.VAT = VAT;
            // this.quantity = quantity;
            this.Name = name;

        }

    /**
     * Returns the VAT rate of the item in percentage
     * @return the VAT rate of the item.
     */
        public int getVAT() {
            return this.VAT;
        }
    /**
     * Returns the price of the item
     * @return the price of the item
     */
        public double getPrice() {
            return this.price;
        }

    /**
     * Returns the identifier of the item
     * @return the identifier of the item
     */
        public String getIdentifier() {
            return this.itemID;
        }
    /**
     * Returns the name of the item
     * @return the name of the item
     */
        public String getName() {
            return this.Name;
        }
    /**
     * Returns the quantity of the item.
     * @return The quantity of the item.
     */
        public int getQuantity() {
            return this.quantity;
        }
    }


