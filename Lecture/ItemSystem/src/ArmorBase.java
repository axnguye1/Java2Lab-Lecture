import javax.naming.Name;

/**
 * @author Amanda Nguyen
 * @since   6/16/22
 */
public abstract class ArmorBase {
    protected String name;
    protected String desc;
    protected int rating;
    protected int durability;
    protected int weight;

    protected int defenseStat;

    protected int value;

    protected boolean isEquipped;

    /**
     *
     * @param name displays the armors type/name
     * @param desc unique description of armor
     * @param rating displays rating so players can decide what armor is better than what armor.
     * @param value displays gold coin value
     * @param durability displays durability until item gets destroyed
     * @param weight weight effects swiftness. every weight makes player velocity .5 lower. (Thirst helps velocity go up)
     * @param defenseStat Amounts to the number of damage negated from attackstrength.
     */
    public ArmorBase(String name, String desc, int rating,int value, int durability, int weight, int defenseStat, boolean isEquipped) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.durability = durability;
        this.weight = weight;
        this.defenseStat = defenseStat;
        this.value = value;
        this.isEquipped=isEquipped;
    }

    /**
     * @since 6/16/22
     * @return the name of the armor piece
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @since 6/16/22
     * @return the item description of armor.
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @since 6/16/22
     * @return the armor's rating/ item score
     */
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @since 6/16/22
     * @return the item's durability
     */
    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    /**
     * @since 6/16/22
     * @return returns weight of armor
     */
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @since 6/16/22
     * @return the item's defense stat
     */
    public int getDefenseStat() {
        return defenseStat;
    }

    public void setDefenseStat(int defenseStat) {
        this.defenseStat = defenseStat;
    }

    /**
     * @since 6/16/22
     * @return the item's gold value
     */
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     *
     * @param name changes the item name
     */

    public void setArmorName(String name) {
        this.name = name;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }
}//end class
