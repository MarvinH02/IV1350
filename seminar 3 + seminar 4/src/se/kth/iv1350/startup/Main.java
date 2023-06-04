package se.kth.iv1350.startup;

import se.kth.iv1350.controller.*;
import se.kth.iv1350.integration.*;
import se.kth.iv1350.view.*;
import java.io.IOException;

/**
 * The main class that serves as the entry point for the application.
 */

public class Main {


    /**
     * The main method of the application.
     *
     * @param args the command line arguments
     * @throws IOException if an I/O error occurs
     */
    public static void main (String[] args) throws IOException {
        ExternalInventorySystem EI = new ExternalInventorySystem();  
        ExternalAccountingSystem EA = new ExternalAccountingSystem();
        Printer printer = new Printer();
        SaleLog saleLog = new SaleLog();
        Controller contr = new Controller( printer, EI, EA);
        View view = new View(contr);
        view.run();
    }

}
