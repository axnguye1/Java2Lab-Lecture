import javax.security.auth.Destroyable;

public class EmptyBottle extends StackableItem implements Fillable, Destroyable {
    public EmptyBottle(int quantity){
        super( 2,"Empty Glass Bottle", quantity, 3);
    }
    public EmptyBottle() { this(0); }


    @Override
    public void fill(){
        this.setQuantity(this.quantity-1);
    }
    @Override
    public void destroy(){this.setItemName("Broken Bottles");}

    @Override
    public String toString(){
        String text = String.format("%s/%d [%d/%d]",itemName, itemCost, quantity, maxStacks);
        return text;
    }
}
