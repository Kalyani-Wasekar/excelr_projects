package All_Java_Projects;



import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		/*
		 * hs.add(3); hs.add(2); hs.add(4);
		 */
		System.out.println(hs);
		
		hs.remove(3);
		System.out.println(hs);
		
		for(Integer element:hs) {
			System.out.println(element);
		}

	}

}

