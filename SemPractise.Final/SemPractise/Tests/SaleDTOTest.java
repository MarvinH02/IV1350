import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.model.Item;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SaleDTOTest {
    @Test
    public void testingTheGetters (){
        ArrayList < Item> items = new ArrayList<>();
        Item itemsInStock = new Item("W2a","Äpple",2, 21,4);
        items.add(itemsInStock);
        LocalDate timeNow = LocalDate.now();


        assertEquals("W2a", itemsInStock.getItemID());
        assertEquals("Äpple", itemsInStock.getName());
        assertEquals(2, itemsInStock.getVAT());
        assertEquals(4, itemsInStock.getQuantity());
        assertEquals(21,itemsInStock.getItemPrice());
    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {


    }
}