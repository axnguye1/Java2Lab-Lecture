public class Dog implements Comparable<Dog> {

    //instance variables
    private String name;
    private double height;
    private double weight;
    private char   gender;
    private boolean isCrabby;

    public Dog() {
        this("Joe",10.0,20.0,'M',false);
    }

    public Dog(String name,
               double height,
               double weight,
               char gender,
               boolean isCrabby) {

        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.isCrabby = isCrabby;
    }

    public String getName() {
        return this.name;
    }
    
    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public char getGender() {
        return this.gender;
    }

    public void speak() {
        System.out.println("woof!");
    }

    public void eat(double amtOfFood) {
        System.out.println("Nom Nom Nom");
        this.weight += amtOfFood * 0.1;

    }
    @Override
    public int compareTo(Dog other){
        if (this.weight < other.getWeight())
            return -1;
        else if (this.weight > other.getWeight())
            return 1;
        return 0;

    }

    public void sleep(double lengthOfTime) {
        System.out.println("snore!");
    }

}
