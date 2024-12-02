package All_Java_Projects;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_and_collection {
    public static void main(String[] args) {
        // C reate an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add 5 fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");

        // Iterate and print the fruits
        System.out.println("Original fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Update the 3rd element (index 2)
        fruits.set(2, "Pineapple");

        // Print the updated list
        System.out.println("\nUpdated fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sort in ascending order
        Collections.sort(fruits);

        // Print the sorted list (ascending)
        System.out.println("\nFruits in ascending order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sort in descending order
        Collections.sort(fruits, Collections.reverseOrder());

        // Print the sorted list (descending)
        System.out.println("\nFruits in descending order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
