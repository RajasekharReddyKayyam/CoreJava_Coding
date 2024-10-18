package ArrayList;

import java.util.StringJoiner;

public class CustomArrayList {
    private int size; // Current size of the list
    private Object[] elementdata; // Array to store elements

    /*
     * Constructor to initialize the CustomArrayList with a specified initial size
     */
    public CustomArrayList(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        this.elementdata = new Object[initialCapacity];
        this.size = 0;
    }

    /*
     * Default constructor initializes with a default capacity of 10
     */
    public CustomArrayList() {
        this(10);
    }

    /*
     * Method to add an element to the list
     */
    public void insert(Object obj) {
        // Check if the array needs to be resized
        if (size == elementdata.length) {
            int newCapacity = elementdata.length + (elementdata.length / 2);
            Object[] newArray = new Object[newCapacity];
            // Copy existing elements to the new array
            System.arraycopy(elementdata, 0, newArray, 0, elementdata.length);
            elementdata = newArray;
        }
        elementdata[size++] = obj; // Add the new element and increment size
    }

    /*
     * Method to get the element at a specified index
     */
    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return elementdata[index];
    }

    /*
     * Method to get the current size of the list
     */
    public int size() {
        return size;
    }

    /*
     * Method to check if the list is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            joiner.add(String.valueOf(elementdata[i]));
        }
        return joiner.toString();
    }
}
