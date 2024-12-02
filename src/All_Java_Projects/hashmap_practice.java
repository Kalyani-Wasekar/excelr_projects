package All_Java_Projects;

import java.util.HashMap;

public class hashmap_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer, String> h1 = new HashMap<Integer, String>();
    h1.put(1, "Java");
    h1.put(2, "Python");
    h1.put(3, "cpp");
    h1.put(4, "c");
    h1.put(5, "golang");
    System.out.println(h1);
    for(Integer element:h1.keySet()) {
    	System.out.println(element + " "+ h1.get(element));
    }
	}
	
	

}
