public class IronLongSword extends WeaponBase implements Breakable, Equippable {

public IronLongSword(){
    super("Long Sword", "Slow attack speed, higher damage per hit.", 88, 45,100,15,25, false);

}
    @Override
    public void equip() {
        this.isEquipped = true;

    }
        @Override
        public void destroy(){
            this.setWeaponName("Sword Hilt");
        }

} //end class
