public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> names = new MyLinkedList<String>();

        names.add("Rick");
        names.add("Morty");
        names.add("Jerry");

        names.add("Mr. Meeseeks",1);
        
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        } 

        System.out.println("State after removing the one at index 0:");
        names.remove(0);

        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        } 

        System.out.println("State after removing the one at index 2:");
        names.remove(2);

        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        } 

    }

} // end class
