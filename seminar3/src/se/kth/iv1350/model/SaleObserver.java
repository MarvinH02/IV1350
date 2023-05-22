package se.kth.iv1350.model;

public interface SaleObserver {

    /**
     * Notifies the observer about a new sale log.
     *
     * @param totalPrice The price of the sale.
     */

    public void startNewSale(double totalPrice);


    }

