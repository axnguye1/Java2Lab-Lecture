public class IronLongSword extends WeaponBase implements Breakable, Equippable {

public IronLongSword(){
    super("Long Sword", "Slow attack speed, higher damage per hit.", 88, 45,100,15,25);

}
    @Override
    public void equip() {
        this.equip();
    }
        @Override
        public void destroy(){
            this.setWeaponName("Sword Hilt");
        }

} //end class
