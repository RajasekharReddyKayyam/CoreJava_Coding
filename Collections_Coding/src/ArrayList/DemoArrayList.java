package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * DemoArrayList class demonstrates the use of ArrayList in Java.
 * This class shows how to create an ArrayList, add heterogeneous objects,
 * access elements, clone the list, and iterate over it using various methods.
 */
public class DemoArrayList {

    /**
     * The main method is the entry point of the program.
     * It demonstrates various operations on an ArrayList, including:
     * - Creating an ArrayList
     * - Adding elements of different types
     * - Inserting and accessing elements
     * - Cloning an ArrayList
     * - Checking for the presence of elements
     * - Iterating over the ArrayList using different techniques
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create an ArrayList to store heterogeneous objects
        ArrayList<Object> list = new ArrayList<>();

        // Add various elements to the list
        list.add("Raj");
        list.add(10);
        list.add(10.6);
        list.add('c');
        
        // Display the contents of the list
        System.out.println(list); // Outputs: [Raj, 10, 10.6, c]
        
        // Insert element at index 2
        list.add(2, 22);
        System.out.println(list); // Outputs: [Raj, 10, 22, 10.6, c]
        
        // Access and display the element at index 3
        System.out.println(list.get(3)); // Outputs: 10.6
        
        // Add the list itself as an element (creating a nested structure)
        list.add(list);
        System.out.println(list); // Outputs: [Raj, 10, 22, 10.6, c, (this Collection)]

        // Create another ArrayList
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add("shiva");
        list2.add(100);
        
        // Insert the first list at index 0 of list2
        list2.add(0, list);
        System.out.println(list2); // Outputs: [[Raj, 10, 22, 10.6, c, (this Collection)], shiva, 100]
        
        // Add a User object to list2
        list2.add(new User("Ravi", "101001", 10000L));
        System.out.println(list2); // Outputs the contents including the User object
        
        // Clone the first list
        Object c = list.clone();
        list.add("Aditya");
        System.out.println(c); // Displays the cloned list contents
        
        // Add all elements from list2 to list
        list.addAll(list2);
        
        // Check if the list contains certain elements
        System.out.println(list.contains(22));   // Outputs: true
        System.out.println(list.contains(2233));  // Outputs: false
        System.out.println(list.containsAll(list2)); // Outputs: false

        System.out.println("********************");
        
        // Create a new ArrayList for demonstration
        ArrayList<Object> list3 = new ArrayList<>();
        list3.add(10);
        list3.add("String");
        
        // Iterate over list3 using a for-each loop
        for (Object x : list3) {
            System.out.println(x);
        }
        
        System.out.println("********************");
        
        // Iterate using an Iterator
        Iterator<Object> itr = list3.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println("********************");
        
        // Iterate using a ListIterator
        ListIterator<Object> listItr = list3.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }
        
        System.out.println("********************");
        
        // Iterate backwards using ListIterator
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
        
        System.out.println("********************");
        
        // Using Streams to iterate
        list3.stream().forEach(i -> System.out.println(i));
        System.out.println("********************");
        
        // Another way to use Streams to iterate
        list3.stream().forEach(System.out::println);
    }
}
