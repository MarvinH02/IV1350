package se.kth.iv1350.integration;

import se.kth.iv1350.model.Item;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * The SaleDTO class represents a data transfer object for a sale.
 * It contains information about the items, full price, and VAT total of the sale.
 */

public class SaleDTO {
    private double VATTot;
    private ArrayList<Item> items;
    private double fullPrice;

    /**
     * Constructs a SaleDTO object with the specified items, full price, and VAT total.
     *
     * @param items     The list of items in the sale.
     * @param fullPrice The full price of the sale.
     * @param VATTot    The total VAT amount of the sale.
     */


    public SaleDTO(ArrayList<Item> items, double fullPrice, double VATTot) {
        this.fullPrice = fullPrice;
        this.items = items;
        this.VATTot = VATTot;
    }


    /**
     * Returns the list of items in the sale.
     *
     * @return The list of items.
     */

    public ArrayList<Item> getItems() {
        return items;
    }
    /**
     * Returns the full price of the sale.
     *
     * @return The full price.
     */

    public double getFullPrice() {
        return fullPrice;
    }

    /**
     * Returns the total VAT amount of the sale.
     *
     * @return The VAT total.
     */

    public double getVATTot() {
        return VATTot;
    }

}