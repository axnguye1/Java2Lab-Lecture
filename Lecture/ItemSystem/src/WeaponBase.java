public abstract class WeaponBase  {
    protected String name;
    protected String desc;
    protected int rating;
    protected int durability;
    protected int weight;
    protected int attackDamage;

    protected int value;

    protected boolean isEquipped;


    /**
     * @since 6/16/22
     * @param name weapon name
     * @param desc weapon description, includes attributes of that weapon
     * @param rating weapon rating, to show which weapon is better scored than another weapon
     * @param value value of weapon
     * @param durability durability of weapon(when weapon Destroy()'s it drops a craftable piece for a new weapon)
     * @param weight weight of weapon, weight affects speed by .5 per lb.
     * @param attackDamage amount of damage inflicted to enemy or another person BEFORE defense Stat is applied and Buffs.
     */
    public WeaponBase(String name, String desc, int rating, int value, int durability, int weight, int attackDamage,boolean isEquipped) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.durability = durability;
        this.weight = weight;
        this.attackDamage = attackDamage;
        this.value = value;
        this.isEquipped = isEquipped;
    }

    /**
     * @since 6/16/22
     * @return item name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @since 6/16/22
     * @return returns description of item
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @since 6/16/22
     * @return returns item rating/score
     */
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @since 6/16/22
     * @return item durability
     */
    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    /**
     * @since 6/16/22
     * @return returns weight of item
     */
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @since 6/16/22
     * @return returns attack damage
     */
    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    /**
     * @since 6/16/22
     * @return returns value of item in Gold coins
     */
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void setWeaponName(String name) {
        this.name = name;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }
}//end class
