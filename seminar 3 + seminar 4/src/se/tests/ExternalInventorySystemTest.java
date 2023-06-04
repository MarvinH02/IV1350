package se.tests;
import se.kth.iv1350.integration.ExternalInventorySystem;
import se.kth.iv1350.integration.ItemNotFoundException;
import se.kth.iv1350.integration.NetworkDownException;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;




 public  class ExternalInventorySystemTest {
     private ExternalInventorySystem ei;


     @Before
     public void setUp() {
         ei = new ExternalInventorySystem();
     }

     @After
     public void tearDown() {
         ei = null;
     }

     @Test
     public void testIfItemIsNotValid() {
         String itemID = "AAAAA" ; // THIS ITEM ID DOES NOT EXIST;
         try {
             ei.itemFinder(itemID);
             fail("Expected item not found exception");
         } catch (NetworkDownException excp) {
             fail("An error has occurred" + excp.getMessage());

         } catch (ItemNotFoundException excp) {
             // Exception is expected, no need to handle it here
         }

     }

     @Test
     public void netWorkDownException() {
         String networkIsDown = "NetworkDownIdentifier"; //Hard coded id in the extrenal inventory system class.
         try {
             ei.itemFinder(networkIsDown);
             fail("Expected a network down exception ");

         } catch (NetworkDownException excp) {
             // Exception is expected, no need to handle it here
         } catch (ItemNotFoundException excp) {
             fail("The item does not exist: " + excp.getMessage());
         }

     }
 }