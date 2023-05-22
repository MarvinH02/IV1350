package se.kth.iv1350.model;

import se.kth.iv1350.integration.SaleDTO;

import java.time.LocalDate;
/**
 * The Receipt class represents a receipt generated for a sale.
 */
    public class Receipt {
        private int totalVAT;
        private int totalPrice;
        private int totalChange;


    /**
     * Constructs a new Receipt object with the specified sale data and payment information.
     *
     * @param saleDTO  The SaleDTO object containing sale data.
     * @param payment  The Payment object representing the payment made.
     */


        public Receipt(SaleDTO saleDTO, Payment payment) {
            this.totalVAT = totalVAT;
            this.totalPrice = totalPrice;
            this.totalChange = totalChange;
        }

    /**
     * Retrieves the total price of the sale from the receipt.
     *
     * @return The total price of the sale.
     */

        public int getTotalPrice() {

            return this.totalPrice;
        }
    /**
     * Retrieves the total VAT (Value Added Tax) from the receipt.
     *
     * @return The total VAT.
     */

        public int getTotalVAT() {

            return this.totalVAT;
        }
    /**
     * Retrieves the total change from the receipt.
     *
     * @return The total change.
     */
        public int getTotalChange() {

            return this.totalChange;
        }

        private void appendLine(StringBuilder builder, String line) {
            builder.append(builder);
            builder.append("\n");
        }

        private void endSection(StringBuilder builder) {
            builder.append("\n");
        }
    }
