public class Kennel {
    //this is silly...
    /*
    private Chihuahua[] chihuahuas;
    private Poodle[] poodles;
    private Rottweiler[] rotties;
     */
    private Dog[] allTheDogs;
    private int numDogs;

    public Kennel() {
        allTheDogs = new Dog[100];
        numDogs=0;
    }
    public void addDog(Dog anotherDog){
        allTheDogs[numDogs] = anotherDog;
        numDogs++;
    }

    public Dog getDog(int index){
        return allTheDogs[index];
    }
}