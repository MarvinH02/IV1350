package se.kth.iv1350.controller;

import se.kth.iv1350.model.*;
import se.kth.iv1350.integration.*;
//import se.kth.iv1350.*;

public class Controller {
    //import se.kth.iv1350.*;

    /**
     * Controller handles all the indata made by the view and passes it out to the model and the integration.
     */

    private SaleLog saleLog;
    private Sale sale;
    private Printer printer;
    private ExternalInventorySystem EISystem;
    private ExternalAccountingSystem EASystem;
    /**
     * Constructor for the Controller.
     *
     * @param saleLog   an instance of SaleLog made for logging sale information
     * @param printer   an instance of Printer for printing receipts
     * @param EISystem  an instance of ExternalInventorySystem for inventory system
     * @param EAsystem  an instance of ExternalAccountingSystem for accounting system
     */

    public Controller(SaleLog saleLog, Printer printer, ExternalInventorySystem EISystem, ExternalAccountingSystem EAsystem) {
        this.saleLog = saleLog;
        this.printer = printer;
        this.EISystem = EISystem;
        this.EASystem = EAsystem;
    }
    /**
     * Starts a new sale by creating a new instance of Sale.
     */

    public void StartSale() {
        sale = new Sale();
    }
    /**
     * Adds an item to the current sale.
     *
     * @param itemID    the ID of the added item
     * @return          a SaleDTO object containing information about the current sale
     */

    public SaleDTO addItem(String itemID, int quantity) {
        if (EISystem.isValid(itemID).equals(itemID)) {
            ItemDTO a = EISystem.itemDescription(itemID);
            sale.addsToSale(itemID, quantity);

            System.out.println("Item name " + a.getName());
            System.out.println(" " +  a.getIdentifier());
            System.out.println(" " + a.getQuantity());
            System.out.println(" "+  a.getPrice());
            System.out.println("  " + a.getVAT());

        }
        return sale.getSaleDTO();
    }

}