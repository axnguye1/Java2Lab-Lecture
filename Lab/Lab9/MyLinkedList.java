public class MyLinkedList<T> {

    private Node firstNode;
    private Node lastNode;
    private int  size;

    public MyLinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void add(T element) {
        Node newNode = new Node(element);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
            size++;
            return;
        }

        // the following code is really expensive
        // we can do better by adding another reference to the lastNode
        // we'll have to do some extra coding to keep this up to date,
        // but if we do it'll be worth it performance-wise!
        /*
        Node currentNode = firstNode;
        while (currentNode.getNext() != null)
            currentNode = currentNode.getNext();
        currentNode.setNext(newNode);
        */

        this.lastNode.setNext(newNode);
        this.lastNode = newNode;
        size++;
    }

    public void add(T element, int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        if (index == size) {
            add(element);
            return;
        } 
        
        Node newNode = new Node(element);

        Node currentNode = firstNode;
        int counter = 0;
        while (counter < index-1) {
            currentNode = currentNode.getNext();
            counter++;
        }
        Node oldNext = currentNode.getNext();
        currentNode.setNext(newNode);
        newNode.setNext(oldNext);
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        T elementToReturn = null;
        // special case 1: there's only one element
        if (size == 1) {
            elementToReturn = firstNode.getData();
            firstNode = null;
            lastNode = null;
            size--;
            return elementToReturn;
        }
        // special case 2: you're deleting the first element
        if (index == 0) {
            elementToReturn = firstNode.getData();
            firstNode = firstNode.getNext();
            size--;
            return elementToReturn;
        }

        // general case:  walk out to the one before the one you want to remove
        // just like with add...
        Node currentNode = firstNode;
        int counter = 0;
        while (counter < index-1) {
            currentNode = currentNode.getNext();
            counter++;
        }
        Node theOneToRemove = currentNode.getNext();
        currentNode.setNext(theOneToRemove.getNext());
        elementToReturn = theOneToRemove.getData();
        // special case 3: you're deleting the last element;
        if (index == size-1)
            lastNode = currentNode;
        // decrement the size
        size--;
        //return the removed thing
        return elementToReturn;
    }
    

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node currentNode = firstNode;
        int counter = 0;
        while (counter < index) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return currentNode.getData();
    }


    private class Node{

        private T data;
        private Node next;

        public Node( T dataElement) {
           this.data = dataElement; 
           this.next = null;
        }

        // queries
        public T getData() {
            return this.data;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    } // end inner class Node

} // end class MyLinkedList
