package se.kth.iv1350.integration;

import se.kth.iv1350.model.Item;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * This class represents all the data about a sale, the quantity of items, price etc.
 */

public class SaleDTO {
        private int priceTot;
        private ArrayList<Item> items = new ArrayList<>();
        private int TotVAT;
        private java.time.LocalDate saleDate;
        private int totPaid;
    /**
     * Creates a new instance of SaleDTO.
     *
     * @param totVAT the total VAT of the sale
     * @param items the list of items sold
     * @param saleDate the date of the sale
     * @param totPaid the amount paid by the customer
     */

        public SaleDTO (int totVAT, ArrayList<Item> items, LocalDate saleDate, int totPaid){
            this.items = items;
            TotVAT = this.TotVAT;
            saleDate = this.saleDate;
            totPaid = this.totPaid;

        }
    /**
     * Returns the list of items sold in the sale.
     *
     * @return the list of items sold
     */

        public ArrayList<Item> getItems() {
            return items;
        }
    /**
     * Returns the total VAT of the sale.
     *
     * @return the total VAT of the sale
     */

        public int getTotVAT() {
            return this.TotVAT;
        }

    /**
     * Returns the date of the sale.
     *
     * @return the date of the sale
     */
        public LocalDate getSaleDate() {
            return this.saleDate;
        }
    /**
     * Returns the total price of the sale.
     *
     * @return the total price of the sale
     */
        public int getPriceTot() {
            return priceTot;
        }
    /**
     * Returns the amount paid by the customer.
     *
     * @return the amount paid by the customer
     */

        public int getTotPaid() {
            return totPaid;
        }
    }



