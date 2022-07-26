import java.util.Arrays;

public class MyArrayList<T> {

    // instance varables
    private Object[] theElements;
    private int size;

    public MyArrayList() {
        this.theElements = new Object[10];
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    // add it to "the end"
    public void add(T element) {
        // if theElements is full, expand the storage
        if ( size >= theElements.length)
            expandStorage();
        theElements[size] = element;
        size++;
    }

    // overloaded add method that does "insert"
    public void add(T element, int index) {
        // if theElements is full, expand the storage
        if ( size >= theElements.length)
            expandStorage();

        if (index > size)
            throw new IndexOutOfBoundsException("Index of " + index + " does not fall within the valid range when size is " + size);
        if (index == size) {
            add(element);
            return;
        }

        for (int i=size-1; i>=index; i--) {
            theElements[i+1] = theElements[i];
        }
        theElements[index] = element;
        size++;
    }

    public T get(int index) {
        if (index > size-1)
            throw new IndexOutOfBoundsException("Index of " + index + " does not fall within the valid range when size is " + size);
        return (T)(theElements[index]);

    }

    // implement the delete method
    // make sure that:
    // 1) the array does not get left with an "empty hole"
    // 2) you return the deleted element
    // 3) you decrement the size
    public void delete(int index) {

        if (index > size-1)
            throw new IndexOutOfBoundsException("Index of " + index + " does not fall within the valid range when size is " + size);
        Object[] tempArray = Arrays.copyOf(theElements, theElements.length);
        for(int i=index; i<theElements.length-1; i++){
            theElements[i] = theElements[i+1];
        }
        size --;
        return (T)tempArray[index];


    }

    private void expandStorage() {

        int newSize = theElements.length + theElements.length/2 + 1;

        Object[] expandedStorage = new Object[newSize];
        for (int i=0; i<size; i++) {
            expandedStorage[i] = theElements[i];
        }
        this.theElements = expandedStorage;
    }

    


} // end class
