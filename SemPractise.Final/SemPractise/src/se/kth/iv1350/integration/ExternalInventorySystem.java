package se.kth.iv1350.integration;

import se.kth.iv1350.model.*;
import se.kth.iv1350.integration.*;

import java.util.ArrayList;

public class ExternalInventorySystem {

        private ItemDTO itemDTO ;
        private ArrayList<Item> items = new ArrayList<>();
        private ItemDTO ItemDTO;


    /**
     * Initializes an external inventory system with a list of pre-defined items.
     */

        public ExternalInventorySystem() {
            items.add(
                    new Item("W2A", "Äpple", 3, 3,6)
            );
            items.add(
                    new Item("W3A", "Banan", 2,5, 8)
            );
        }

    /**
     * Checks if an itemID is valid.
     * @param itemID the ID of the item.
     * @return the item object if the item identifier is valid, otherwise null.
     */
        public Item isValid (String itemID){
            for (Item item : items) {
                if (item.getItemID().equals(itemID))
                    return item;
            }
            return null;
        }
    /**
     * Returns an itemdescription of the specified identifier.
     * @param itemID the itemid the spcific item that we want a description for.
     * @return the ItemDTO object containing the item description.
     */
        public ItemDTO itemDescription (String itemID){
            for (Item items :items){
                if (items.getItemID().equals(itemID)){
                    return new ItemDTO(items.getItemPrice(), items.getItemID(), items.getVAT(),items.getQuantity(), items.getName());
                }
            }
            return null;
        }
    /**
     * is supposed to update the external inventory system with the items from the current sale.
     * @param sale the Sale object containing the items to be updated.
     */
        public void updateExternalInventorySystem (Sale sale){

        }

    }


