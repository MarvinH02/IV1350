
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.kth.iv1350.model.Item;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    private Item item;

    @BeforeEach
    public void setUp() {
        item = new Item("W2A", "Banan", 12, 2, 3);

    }

    @AfterEach
    void tearDown() {
        item = null;
    }

    @Test
    public void testGetitemID() {
        assertEquals("W2A", item.getItemID());

    }

    @Test
    public void testGetPrice() {
        assertEquals(2, item.getItemPrice());
    }

    @Test
    public void testGetName() {
        assertEquals("Banan", item.getName());
    }

    @Test
    public void testGetVAT() {
        assertEquals(12, item.getVAT());
    }

    @Test
    public void testIncrementQuantity() {
        int startQuantity = item.getQuantity();
        int ThenewQuantity = item.incrementQuantity();
        assertEquals(startQuantity +=1, ThenewQuantity);
        item.setQuantity(startQuantity);
        assertEquals(ThenewQuantity, item.getQuantity());
    }

}


