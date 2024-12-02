package All_Java_Projects;
import java.util.*;

public class arraylist1 {
static class Main {
		    public static void main(String args[]){
		      
		        // Creating an Array of string type
		        ArrayList<String> al = new ArrayList<>();
		      
		          // 1. Addition

		        // Adding elements to ArrayList
		        // at the end
		        al.add("Java");
		        al.add("Programming");

		          System.out.println("Orignal List : "+al);
		          
		          // Adding Elements at the specific
		          // index
		        al.add(1, "and Python");

		          System.out.println("After Adding element at index 1 : "
		                           + al);
		          
		          // 2. Deletion of Element
		          
		          // Removing Element using index
		          al.remove(0);
		      
		          System.out.println("Element removed from index 0 : "
		                           + al);
		          
		          // Removing Element using the value
		          al.remove("Java");
		      
		          System.out.println("Element Java removed : "
		                           + al);
		      
		          // 3. Updating Values
		          
		          // Updating value at index 0
		          al.set(0,"Java");
		          
		      
		        // Printing all the elements in an ArrayList
		        System.out.println("List after updation of value : "+al);
		    }
		}
	}


