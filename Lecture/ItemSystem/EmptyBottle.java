public class EmptyBottle extends StackableItem implements Fillable {
    public EmptyBottle(int quantity){
        super( 2,"Empty Glass Bottle", quantity, 3);
    }
    public EmptyBottle() { this(0); }


    @Override
    public void fill(){
        this.setQuantity(this.quantity-1);
    }

    @Override
    public String toString(){
        String text = String.format("%s/%d [%d/%d]",itemName, itemCost, quantity, maxStacks);
        return text;
    }
}
