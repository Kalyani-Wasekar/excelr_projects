package All_Java_Projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<String> al=new ArrayList<String>();
	al.add("hi");
	al.add("hello");
	al.add("hi");
	al.add("hi");
	al.add("hi");
	al.add("hello");
	System.out.println(al);
	
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	/*
	 * al.clear(); System.out.println(al);
	 */
	/* al.remove(2); */
	al.set(2, "excelr");
	System.out.println(al);
	System.out.println(al.get(0));
	
	Collections.sort(al);
	System.out.println(al);
	
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
	
	
	}

}
