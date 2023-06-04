package se.kth.iv1350.integration;
/**
 * The ItemNotFound class represents an exception that is thrown when an item is missing from the inventory.
 * It extends the Exception class.
 */
public class ItemNotFoundException extends Exception {


    /**
     * Constructs an ItemMissing object with the specified error message.
     *
     * @param message The error message associated with the exception.
     */
    public ItemNotFoundException (String message){
        super(message);

    }
}
