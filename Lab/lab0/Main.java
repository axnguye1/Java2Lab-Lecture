import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       Rottweiler spike = new Rottweiler("Spike", 5, false, 65.3);
        Dog fifi = new Poodle("Fifi",2,false,16.8);
        Chihuahua jose = new Chihuahua("Jose",6, true,3.9);



        //upcasting to a more abstract type, is always SAFE and ALLOWED
        ((Dog)jose).speak();

        //downcasting, though is dangerous
        //when downcasting always check using instanceof

        //((Poodle)fifi).lookPretty(); !!first version!!
        if(fifi instanceof Poodle)
            ((Poodle)fifi).lookPretty();



        Dog joe = null;

        System.out.println("Enter 1 to build a Rotty,  2 for a poodle, 3 for a chihuahua");
        Scanner input = new Scanner(System.in);
        int response = input.nextInt();
        if(response ==1)
            joe = new Rottweiler("Spike", 5, false, 65.3);
        else if (response ==2)
            joe = new Poodle("Fifi",2,false,16.8);
        else if (response ==3)
            joe = new Chihuahua("Jose",6, true,3.9);

        joe.speak();
        System.out.println(joe.toString());
    }

}//end class main