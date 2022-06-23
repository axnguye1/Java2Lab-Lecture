public abstract class ItemBase {
    protected int itemCost;
    protected String itemName;



    /**
     *
     * @param itemCost the cost of an item in gold coins
     * @param itemName the name of an item
     */
    public ItemBase(int itemCost, String itemName) {
        this.itemCost = itemCost;
        this.itemName = itemName;

    }

    /**
     * @since 6/16/22
     * @return the item cost
     */
    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    /**
     * @since 6/16/22
     * @return the item name
     */
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}//end class
