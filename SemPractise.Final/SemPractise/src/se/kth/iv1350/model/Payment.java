package se.kth.iv1350.model;
/**
 * this class represents the payment action carried out by the user.
 */

    public class Payment {
        private String paymentMethod;
        private int amountPaid;
        private double amoutChange;

    /**
     * Initializes a payment object with the specified amount paid.
     * @param amount The amount paid.
     * @return The amount of change to be returned to the customer.
     */

        public double Payment(double amount){
            this.amoutChange = amoutChange;
            return amoutChange;

        }
    /**
     * Starts the payment process.
     * We unfortunately did not finish this method.
     */
        public void startPayment(){


        }
    /**
     * Cancels the payment process.
     * We unfortunately did not finish this method either.
     */
        public void cancelPayment(){


        }

    /**
     * Gets the payment method used for the payment.
     * @return The payment method.
     */
        public String getPaymentMethod() {
            return paymentMethod;
        }
    /**
     * Gets the amount paid for the payment.
     * @return The amount paid.
     */

        public int getAmountPaid() {
            return this.amountPaid;
        }
    /**
     * Calculates the amount of change to be returned to the customer.
     * @param totalPaid The total amount paid by the customer.
     * @param sale The sale object.
     * @return The amount of change to be returned to the customer.
     */
        public double getAmoutChange(int totalPaid, Sale sale) {
            this.amoutChange = amoutChange;
            amoutChange = totalPaid -sale.getAmount();
            return amoutChange;
        }
    }


