public class Poodle extends Dog {
    //rottweiler is going to inherit everything in dog,
    //except the constructor
    public Poodle(String name, int age, boolean fed, double height) {
        //anything labeled private can only be accessed in the class its decalred
        //protected instance variables can be modified in subclasses
        super(name,age,fed,height);
    }
    public void lookPretty(){
        System.out.println("OOOOH IM SO FANCY!");
    }

    @Override
    public void speak() {
        System.out.println("baaahh, baby!");
    }
}//end class