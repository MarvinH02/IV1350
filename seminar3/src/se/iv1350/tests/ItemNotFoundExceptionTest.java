package se.iv1350.tests;

import org.junit.jupiter.api.Test;
import se.kth.iv1350.integration.ItemNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
public class ItemNotFoundExceptionTest {

    @Test
    public void testItemNotFoundException(){
        String expectedOutPut = "This item is not in stock";
        ItemNotFoundException itemNotFoundExceptiontemNotFoundexception = new ItemNotFoundException(expectedOutPut);
        String actualMessage = itemNotFoundExceptiontemNotFoundexception.getMessage();
        assertNotNull(expectedOutPut);
        assertEquals(expectedOutPut , actualMessage , "Expected out put does not match");


        System.out.println("Test completed!");

    }

}