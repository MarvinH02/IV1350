package se.kth.iv1350.view;
import se.kth.iv1350.integration.*;
import se.kth.iv1350.model.*;
import se.kth.iv1350.controller.*;

/**
 * This class represents the View of the program. It handles user input and output to the console.
 */
public class View {
    /**
     * Creates a new instance of View.
     * @param contr The controller to use for handling user input.
     */
    private Controller contr;
    private int CustomerCash = 100;
    //  private double VAT = 0.12;

    /**
     * Creates a new instance of View.
     * @param contr The controller to use for handling user input.
     */
    public View(Controller contr) {
        this.contr = contr;

    }
    /**
     * Runs the program and starts a new sale. Adds an item to the sale.
     */
    public void run() {
        contr.StartSale();
        System.out.println("A new sale is started.");

        contr.addItem("W2A", 3);




    }
}