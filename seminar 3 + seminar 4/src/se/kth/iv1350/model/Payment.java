package se.kth.iv1350.model;
import se.kth.iv1350.model.Sale;

/**
 * The Payment class represents a payment made during a sale.
 */
public class Payment {

    private double amountPaid;
    private double amountChange;

    /**
     * Performs the payment operation with the specified amount.
     *
     * @param amount The amount to be paid.
     */

    public void pay(double amount){
    }

    /**
     * Initializes the payment and calculates the amount of change.
     *
     * @param amountPaid The amount paid by the customer.
     */

    public void payment(double amountPaid){
        Sale sale = new Sale();
        double fullPrice = sale.getFullPrice();
        this.amountPaid = amountPaid;
        this.amountChange = amountPaid - fullPrice;
    }
}
