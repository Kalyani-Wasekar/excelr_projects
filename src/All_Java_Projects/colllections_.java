package All_Java_Projects;

import java.util.ArrayList;
import java.util.Collections;
//Write a Java program to create 
//an array list, add 5 fruits (strings) and iterate the collection. 
//Update the 3 rd element and 
//print the values and sort it in ascending and descending.
public class colllections_ {

	public static void main(String[] args) {
	
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("pineapple");
		fruits.add("orange");
		//print the original elements.
		for(String elements : fruits) {
		System.out.println(elements);
		}
		// update the third element.
		fruits.set(2,"grapes");
		System.out.println(fruits);
		//sort and print in the ascending order.
		Collections.sort(fruits);
		System.out.println();
		//sort and print in the descending order.
		Collections.sort(fruits,Collections.reverseOrder());
		System.out.println(fruits);
		
	}	
		
	}