public class Chihuahua extends Dog {
    //rottweiler is going to inherit everything in dog,
    //except the constructor
    public Chihuahua(String name, int age, boolean fed, double height) {
        //anything labeled private can only be accessed in the class its decalred
        //protected instance variables can be modified in subclasses
        super(name,age,fed,height);
    }
    @Override
    public void speak() {
        System.out.println("eeep!");
    }
}//end class