import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Define a LinkedList of String and add four names
        LinkedList<String> namesList = new LinkedList<>();
        namesList.add("Eve");
        namesList.add("Frank");
        namesList.add("Grace");
        namesList.add("Harry");

        // Using 'for loop' to traverse through the array and print names
        System.out.println("Traversing with 'for loop':");
        for (String name : namesList) {
            System.out.println(name);
        }

        // Remove the first and the last element
        namesList.removeFirst();
        namesList.removeLast();

        // Print the list using 'advanced for loop'
        System.out.println("\nList after removing first and last element:");
        for (String name : namesList) {
            System.out.println(name);
        }

        // Add new names at the first and last position
        namesList.addFirst("Ivy");
        namesList.addLast("Jack");

        // Print the list using an iterator
        System.out.println("\nList after adding new names:");
        Iterator<String> iterator = namesList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
