package All_Java_Projects;

import java.util.HashSet;

public class Hashset_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashSet<Integer> h1 = new HashSet<Integer>();
         h1.add(2);
         h1.add(4);
         h1.add(6);
         h1.add(8);
         h1.add(10);
         // h1.remove(6);
         for(int element : h1) {
        	 if(element==6) {
        		 h1.remove(element);
        		  continue;
        	 }
         }
         System.out.println(h1);
	}

}
