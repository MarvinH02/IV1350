
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

import se.kth.iv1350.integration.*;
import se.kth.iv1350.model.*;

import static org.junit.jupiter.api.Assertions.*;

public class ExternalInventorySystemTest {
    private ExternalInventorySystem ei;


    @BeforeEach
    void setUp() {
        ei = new ExternalInventorySystem();
    }

    @AfterEach
    void tearDown() {
        ei = null;
    }
    @Test
    public void testsSearchForItem (){
        ItemDTO itemA = new ItemDTO(5.0, "W2A",2,10, "Äpple");
        // ItemDTO itemB = new ItemDTO(7.0, "W3A",6,4, "Banan");
        Item toFind = ei.isValid("W2A");

        assertEquals("W2A", itemA.getIdentifier(), toFind.getItemID());
        assertEquals("Äpple" , itemA.getName() , toFind.getName());
        assertEquals(2,itemA.getVAT(), toFind.getVAT());
        assertEquals(5, itemA.getPrice(), toFind.getItemPrice());
        assertEquals(10, itemA.getQuantity(), toFind.getQuantity());


    }

}
