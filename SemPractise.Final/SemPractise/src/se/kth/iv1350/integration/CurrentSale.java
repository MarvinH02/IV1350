package se.kth.iv1350.integration;


import se.kth.iv1350.model.Item;

public class CurrentSale {
    private String currentSaleItem;
    private String currentSaleItemName;
    private double currentSaleItemPrice;
    private double currentSaleRunningTotal;

    /**
     * Creates a new instance of CurrentSale.
     *
     * @param currentSaleRunningTotal The current running total of the sale.
     * @param item The item being added to the current sale.
     */


    public CurrentSale(double currentSaleRunningTotal, Item item) {
        this.currentSaleItem = item.getName();
        this.currentSaleItemName = item.getName();
        this.currentSaleItemPrice = item.getItemPrice();
        this.currentSaleRunningTotal = currentSaleRunningTotal;


    }
    /**
     * Gets the current price of the current sale item.
     *
     * @return The current price of the current sale item.
     */

    public double getCurrentSaleItemPrice() {
        return currentSaleItemPrice;
    }
    /**
     * Gets the identifier of the current sale item.
     *
     * @return The identifier of the current sale item.
     */

    public String getCurrentSaleItem() {
        return currentSaleItem;
    }
    /**
     * Gets the current running total of the sale.
     *
     * @return The current running total of the sale.
     */

    public double getCurrentSaleRunningTotal() {
        return currentSaleRunningTotal;
    }
    /**
     * Gets the name of the current sale item.
     *
     * @return The name of the current sale item.
     */
    public String getCurrentSaleItemName() {
        return currentSaleItemName;
    }
}


