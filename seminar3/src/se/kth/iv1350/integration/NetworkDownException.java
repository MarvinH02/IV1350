package se.kth.iv1350.integration;
/**
 * The NetWorkDownException class represents an
 * exception that occurs when there is a simulated failure in the database.
 */
public class NetworkDownException extends Exception {

    /**
     * Constructs a new DatabaseFailureException with the specified error message.
     *
     * @param message The error message associated with the exception.
     */
    public NetworkDownException(String message){

        super(message);
    }
}
