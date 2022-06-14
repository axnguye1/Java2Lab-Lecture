public abstract class ArmorBase {
    protected String name;
    protected String desc;
    protected int rating;
    protected int durability;
    protected int weight;

    protected int defenseStat;

    protected int value;

    public ArmorBase(String name, String desc, int rating,int value, int durability, int weight, int defenseStat) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
        this.durability = durability;
        this.weight = weight;
        this.defenseStat = defenseStat;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDefenseStat() {
        return defenseStat;
    }

    public void setDefenseStat(int defenseStat) {
        this.defenseStat = defenseStat;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}//end class
