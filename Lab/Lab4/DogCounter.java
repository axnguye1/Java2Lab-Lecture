import java.util.TreeMap;
import java.util.Set;

public class DogCounter {

    // instance variables which represent what an object of this type KNOWS ABOUT

    private TreeMap<String, Integer> theMap;

    // methods which represent what an object of this type CAN DO
    public DogCounter() {
        theMap = new TreeMap<>();
    }

    public void DogCounting(String dog) {

        // split the string on the "delimiter" which is a space character
        String[] doggies = dog.split(" ");

        for (String s : doggies) {
            //System.out.println(s);
            if (! theMap.containsKey(s)) {
                theMap.put(s,1);
            } else {
                int priorNumTimesSeen = theMap.remove(s);
                theMap.put(s,priorNumTimesSeen+1);
            }

        }

    }

    public void printDogCount() {

        Set<String> allDogs = theMap.keySet();
        for (String s : allDogs) {
            System.out.println(s + " " + theMap.get(s));
        }

    }

    public void reset() {

        theMap.clear();

    }


} // end of class WordCounter
