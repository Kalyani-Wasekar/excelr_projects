//package All_Java_Projects;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class collections_practice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// take an arraylist and swap the elements in arraylist
//		ArrayList<String> S1= new ArrayList<String>();
//		S1.add("Mahindra");
//		S1.add("Nano");
//		S1.add("Bajaj");
//		S1.add("Hero");
//		S1.add("hyundai");
//		System.out.println(S1);
//		Collections.swap(S1,1,3);
//		System.out.println(S1);
//		
//
//	}
//
//}


// create two arraylist and combine and compare them
package All_Java_Projects;

import java.util.ArrayList;
import java.util.Collections;


public class collections_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> S1= new ArrayList<String>();
		S1.add("Ram");
	    S1.add("Padma");	
	    S1.add("Sham");
		
		ArrayList<String> S2= new ArrayList<String>();
		S2.add("Deshmukh");
		S2.add("Jadhav");
		S2.add("Kale");
		S2.add("Padma");
		 S2.add("Sham");
		ArrayList<String> S3= new ArrayList<String>();
		
		for(String element: S1) {
			S3.add(S2.contains(element) ? "yes" :"No");
		}
		System.out.println(S3);
		
		
	}
}
	