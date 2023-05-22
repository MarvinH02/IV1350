package se.kth.iv1350.controller;

import se.kth.iv1350.utility.LogHandler;
import se.kth.iv1350.model.*;
import se.kth.iv1350.integration.*;

import java.util.ArrayList;
import java.util.List;
/**
 * The Controller class handles the flow of operations in the point of sale system.
 * It interacts with external systems, manages sales, and communicates with observers.
 */
public class Controller {

    private ExternalAccountingSystem EASystem;

    private ExternalInventorySystem EISystem;

    private Sale sale;

    private Printer printer;

    private SaleLog saleLog;

    private LogHandler logHandler;

    private List <SaleObserver> saleObservers = new ArrayList<>();

    /**
     * Constructs a Controller object.
     *
     * @param printer    The printer is use for printing receipts
     * @param EISystem   is used to search for items in stock.
     * @param EASystem   The external accounting system for updating accounting information.
     */

    public Controller( Printer printer, ExternalInventorySystem EISystem, ExternalAccountingSystem EASystem) {
        this.EASystem = EASystem;
        this.EISystem = EISystem;
        this.printer = printer;
        this.logHandler = logHandler;

    }

    /**
     * Starts a new sale by initializing a new Sale object and adding sale observers.
     */

    public void StartSale() {

        this.sale = new Sale();
        for (SaleObserver saleObserver :saleObservers){
            sale.addsToSaleObserver(saleObserver);
        }
    }

    /**
     * Scans an item based on the provided item ID and adds it to the current sale.
     *
     * @param ItemID The ID of the item to be scanned.
     * @return The ItemDTO representing the scanned item.
     * @throws NetworkDownException if the given variable is entered in to simulate a system failure.
     * @throws ItemNotFoundException If the scanned item is not found in the inventory.
     */
    public ItemDTO scanItem(String ItemID) throws ItemNotFoundException, NetworkDownException {
        try {
            ItemDTO itemFound = EISystem.itemFinder(ItemID);
            if (itemFound != null) {
                sale.addItem(itemFound);
                return itemFound;
            }
        } catch (ItemNotFoundException excp) {
            throw new ItemNotFoundException("This item is not in stock");

        } catch (NetworkDownException excp) {
            throw new NetworkDownException(excp.getMessage());

        }
        return null;



    }

    /**
     * Finalizes the total price of the current sale (including VAT)
     *
     * @return The total price of the current sale.
     */
    public double finalizeTotal() {

        double totalPrice = sale.getFullPrice();
        return totalPrice;
    }

    /**
     * Finalizes the total VAT amount of the current sale.
     *
     * @return The total VAT amount of the current sale.
     */


    public double finalizeVAT(){

        double totalVAT = sale.getVATTot();
        return totalVAT;
    }

    /**
     * Retrieves the total quantity of scanned items in the current sale.
     *
     * @return The total quantity of scanned items.
     */

    public int getScannedItemCount() {

        int itemQuantity = sale.getScannedItemCount();
        return itemQuantity;
    }
    /**
     * Starts the payment process for the current sale.
     *
     * @param amount The amount to be paid.
     */
    public void startPayment(double amount){
        sale.pay(amount);
        sale.updateTotal();
    }

    /**
     * Adds a sale observer to receive updates from the current sale.
     *
     * @param saleObserver The SaleObserver to be added.
     */
    public void addSaleObserver(SaleObserver saleObserver){
        saleObservers.add(saleObserver);
    }

}
