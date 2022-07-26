public class Main {

    public static void main(String[] args) {

        MyArrayList<String> names = new MyArrayList<String>();

        names.add("Rick");
        names.add("Morty");
        names.add("Jerry");

        names.add("Mr. Meeseeks",1);
        names.add("Mr. BeepBoop",2);
       // names.delete(1);
        
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        } 

    }

} // end class
