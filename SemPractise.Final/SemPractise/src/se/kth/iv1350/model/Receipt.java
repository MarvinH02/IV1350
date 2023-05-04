package se.kth.iv1350.model;


import se.kth.iv1350.integration.SaleDTO;

import java.time.LocalDate;
/**
 * Receipt makes up for putting att the sale data into one class.
 * The receipt is what is printed out at the end of the program.
 */

public class Receipt {
    private int totalVAT;
    private int totalPrice;
    private int totalChange;
    private java.time.LocalDate timeOfSale;

    /**
     * Creates an instance of the Receipt class.
     * @param saleDTO SaleDTO object containing information about the sale.
     * @param payment Payment object containing information about the payment.
     */
    public Receipt(SaleDTO saleDTO, Payment payment){
        this.timeOfSale = timeOfSale;
        this.totalChange = totalChange;
        this.totalPrice = totalPrice;
        this.totalVAT = totalVAT;


    }
    /**
     * Gets the total price of the sale.
     * @return The total price of the sale.
     */

    public int getTotalPrice() {
        return this.totalPrice;
    }
    /**
     * Gets the total VAT of the sale.
     * @return The total VAT of the sale.
     */

    public int getTotalVAT() {
        return this.totalVAT;
    }
    /**
     * Gets the time of the sale.
     * @return The time of the sale.
     */

    public LocalDate getTimeOfSale() {
        return this.timeOfSale;
    }
    /**
     * Gets the total change of the sale.
     * @return The total change of the sale.
     */

    public int getTotalChange() {
        return this.totalChange;


    }

}
