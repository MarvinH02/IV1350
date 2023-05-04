

import org.junit.jupiter.api.*;
import se.kth.iv1350.integration.ItemDTO;

import static org.junit.jupiter.api.Assertions.*;

public class ItemDTOtest {

    private ItemDTO item;

    @BeforeEach
    public void setUp() {
        item = new ItemDTO(10.0, "123", 25, 1, "TestAR");
    }

    @AfterEach
    public void tearDown() {
        item = null;
    }

    @Test
    public void testGetPrice() {
        assertEquals(10.0, item.getPrice() );
    }

    @Test
    public void testGetIdentifier() {
        assertEquals("123", item.getIdentifier());
    }

    @Test
    public void testGetVAT (){
        assertEquals(25, item.getVAT());
    }
    @Test
    public void testName(){
        assertEquals("TestAR", item.getName());
    }
}
