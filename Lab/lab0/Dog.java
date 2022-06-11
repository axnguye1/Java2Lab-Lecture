public abstract class Dog{
    //instance variables
    protected String name;
    protected int age;
    protected boolean fedOrNotToday;
    protected double height;

    //constructor


    public Dog(String name, int age, boolean fed, double height) {
        this.name = name;
        this.age = age;
        this.fedOrNotToday = fed;
        this.height = height;
    }
//getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getFedOrNot() {
        return this.fedOrNotToday;
    }

    public void setFedOrNot(boolean fed) {
        this.fedOrNotToday = fed;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //end of setters and getters
    //abstract method- no default behavior
    // concrete classes must provide an implementation

    public abstract void speak();

    @Override
    public String toString(){
        String state = "Dog called " + name+ " ";
        state += "who is " + age+" years old, ";
        if (this.fedOrNotToday)
            state+="who's been fed ";
        else
            state+="Who's not been fed ";
        state+=" and is "+height+" inches tall";
        return state;
    }
    @Override
    //object's equals reference equality
    //if two references point to the same object, then those memory addresses
    //(values assigned to variables),are equals
    public boolean equals(Object other){

        /* this is what objects equals does
        if(this==other)
            return true;
        return false;
        what i want is a deeper value
    */

if (other == null  )
    return false;
if(other == this)
    return true;
return this.getName() == ((Dog) other).getName() &&
        this.getAge() == ((Dog) other).getAge() &&
        this.getHeight() == ((Dog)other).getHeight() &&
        this.getFedOrNot() == ((Dog)other).getFedOrNot();



    }//end equals
} //end class
