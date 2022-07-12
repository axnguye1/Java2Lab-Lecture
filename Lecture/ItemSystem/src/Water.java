public  class Water extends StackableItem implements Consumable, Breakable {
    public Water(int quantity){
    super(10, "Water", quantity, 3);
    }

    public Water(){this(1); }
    @Override
    public void consume() {
        this.setQuantity(this.quantity-1);
    }

    @Override
    public void destroy(){
        this.setItemName("Empty Bottle");
    }
  /*  @Override
    public void addThirst(){
        this.hydrate();
    }*/

    @Override
    public String toString(){
        String text = String.format("%s/%dgp [%d/%d]",itemName, itemCost, quantity, maxStacks);
        return text;
    }

}
