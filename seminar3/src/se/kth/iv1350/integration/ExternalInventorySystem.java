
package se.kth.iv1350.integration;
import java.util.ArrayList;

/**
 * The ExternalInventorySystem class represents an external inventory system that contains items.
 */
public class ExternalInventorySystem {
    ArrayList<ItemDTO> items = new ArrayList<>();
    /**
     * Constructs an ExternalInventorySystem object and initializes it with hardcoded items.
     */
    public ExternalInventorySystem(){
        items.add(new ItemDTO("AA", 0.10,10,"Apple"));
        items.add(new ItemDTO("BB", 0.12,15,"Bread"));
        items.add(new ItemDTO("CC", 0.15,20,"Orange Juice"));
        items.add(new ItemDTO("DD", 0.12,10,"Milk"));
    }

    /**
     * Finds an item in the inventory system based on the provided item identifier.
     *
     * @param ItemID The item identifier to search for.
     * @return The ItemDTO object representing the found item.
     * @throws NetworkDownException If the database cannot be called due to a server failure.
     * @throws ItemNotFoundException If the item with the specified identifier is not found in the inventory.
     */

    public ItemDTO itemFinder(String ItemID) throws ItemNotFoundException, NetworkDownException {


        for (ItemDTO item : items) {
            if (ItemID.equals("NetworkDownIdentifier")) {
                throw new NetworkDownException("The network is down ");
            }
            if (item.getItemID().equals(ItemID)) {
                return item;
            }
        }

        throw new ItemNotFoundException("The item with this identifier " + ItemID + "was not found" );
    }

}
