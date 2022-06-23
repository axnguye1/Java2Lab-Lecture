public class IronHelmet extends ArmorBase implements Equippable, Breakable{
    public IronHelmet(){
        super("Iron Helmet", "Trust this rusty iron helmet to protect that noggin.", 76, 25,100,6,3, false);


    }

    @Override
    public void equip() {
        this.isEquipped = true;

    }
    @Override
    public void destroy(){
        this.setArmorName("Iron Nugget");
    }

} //end class

