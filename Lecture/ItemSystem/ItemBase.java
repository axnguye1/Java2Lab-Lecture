public abstract class ItemBase {
    protected int itemCost;
    protected String itemName;

    public ItemBase(int itemCost, String itemName) {
        this.itemCost = itemCost;
        this.itemName = itemName;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void setItemCost(int itemCost) {
        this.itemCost = itemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}//end class
