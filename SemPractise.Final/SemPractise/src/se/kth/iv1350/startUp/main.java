package se.kth.iv1350.startUp;

import se.kth.iv1350.controller.*;
import se.kth.iv1350.model.*;
import se.kth.iv1350.integration.*;
import se.kth.iv1350.view.*;

public class main {
    /**
     * The main method of the program that initializes the external systems, the printer, the sale log,
     * and the controller. It then creates a view and runs the program.
     */
        public static void main(String[] args) {
            ExternalInventorySystem EI = new ExternalInventorySystem();
            ExternalAccountingSystem EA = new ExternalAccountingSystem();
            Printer printer = new Printer();
            SaleLog saleLog = new SaleLog();

            Controller contr = new Controller(saleLog, printer, EI, EA);
            View view = new View(contr);
            view.run();
        }

    }




