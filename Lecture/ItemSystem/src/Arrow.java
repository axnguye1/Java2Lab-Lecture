public class Arrow extends StackableItem implements Consumable, Breakable {
    public Arrow(int quantity){
        super(5, "Arrow", quantity, 16);
    }
    public Arrow(){ this(1); }

    @Override
    public void consume() {
        this.setQuantity(this.quantity-1);
    }

    @Override
    public void destroy(){
        this.setItemName("Arrows");
    }

    @Override
    public String toString(){
        String text = String.format("%s/%dgp [%d/%d]",itemName, itemCost, quantity, maxStacks);
        return text;
    }




}
