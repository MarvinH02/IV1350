package se.iv1350.tests;

import org.junit.Test;
import se.kth.iv1350.integration.NetworkDownException;

import static org.junit.jupiter.api.Assertions.*;

public class NetworkDownExceptionTest {

    @Test
    public void testNetworkIsDownException (){
        String errorMessage = "Network is down ";

        NetworkDownException exceptions = new NetworkDownException(errorMessage);
        assertNotNull(exceptions);
        assertEquals(errorMessage, exceptions.getMessage());

        System.out.println("Test completed");
    }


}