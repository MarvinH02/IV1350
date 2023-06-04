package se.tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import se.kth.iv1350.controller.Controller;
import se.kth.iv1350.integration.*;


import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
    private Controller controller;


    @Before
    public void setup() {
        ExternalInventorySystem EI = new ExternalInventorySystem();
        Printer printer = new Printer();
        ExternalAccountingSystem EA = new ExternalAccountingSystem();
        controller = new Controller(printer, EI, EA);
    }

    @AfterAll
    public void teardown() {
        controller = null;

    }

    @Test
    public void testScanItem() {
        controller.StartSale();
        ItemDTO expecteditemDTO = new ItemDTO("AA", 0.10, 10, "Apple");

        try {
            ItemDTO info = controller.scanItem(expecteditemDTO.getItemID());
           // assertNotNull("Returned item should not be null", info);
            assertEquals(expecteditemDTO.getItemID(), info.getItemID(), "Item ID was not identified correctly");
            assertEquals(expecteditemDTO.getItemName(), info.getItemName(), "Item name was not identified correctly");
            assertEquals(expecteditemDTO.getVATRate(), info.getVATRate(), "Incorrect VAT rate! ");
            assertEquals(expecteditemDTO.getItemPrice(), info.getItemPrice() , "Item price is not correct");


        } catch (ItemNotFoundException excp) {
            fail("A exception has been thrown" + excp.getMessage());
        } catch (NetworkDownException excp) {
            fail("A network down exception has been thrown" + excp.getMessage());
        }

    }
}
