package se.kth.iv1350.view;

import se.kth.iv1350.controller.*;

import se.kth.iv1350.integration.*;
import se.kth.iv1350.utility.LogHandler;

import java.io.IOException;

/**
 * This class represents the View of the program. It handles user input and output to the console.
 */
public class View {
    private Controller contr;
    private LogHandler logHandler;

    public View(Controller contr) throws IOException {

        this.contr = contr;
        contr.addSaleObserver(new TotalRevenueFileOutput());
        contr.addSaleObserver(new TotalRevenueView());
        logHandler = new LogHandler();
    }

    public void run() {
        contr.StartSale();
        System.out.println("New Sale");

        callScanItem("AA");


        double total = contr.finalizeTotal();
        double vat = contr.finalizeVAT();

        System.out.println("Total price of sale: " + total + " SEK (VAT: " + vat + " SEK) | Quantity of items: "
                + contr.getScannedItemCount() + "." + System.lineSeparator());
        contr.startPayment(1000);

        contr.StartSale();
        callScanItem("CC");
        System.out.println("Total price of sale: " + total + " SEK (VAT: " + vat + " SEK) | Quantity of items: "
                + contr.getScannedItemCount() + "." + System.lineSeparator());
        contr.startPayment(1000);

        contr.StartSale();
        callScanItem("NetworkDownIdentifier");
        callScanItem("BB");
        System.out.println("Total price of sale: " + total + " SEK (VAT: " + vat + " SEK) | Quantity of items: "
                + contr.getScannedItemCount() + "." + System.lineSeparator());
        contr.startPayment(1000);
    }

    private void callScanItem (String itemID) {
        try {
            ItemDTO itemScanned = contr.scanItem(itemID);

            System.out.println(itemScanned.getItemName() + " - price: " +
                    itemScanned.getItemPrice() + " SEK | " + "VAT rate: "
                    + itemScanned.getVATRate() + "%");
        }

        catch (ItemNotFoundException exp){
            System.err.println("An error occurred while scanning an item." + exp.getMessage());
        }
        catch (NetworkDownException exp){

            logHandler.LogException(exp);

            System.err.println("Database could not be called.");
        }
    }
}
