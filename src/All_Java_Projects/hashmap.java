package All_Java_Projects;



import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("John", 123);
		hm.put("George", 124);
		hm.put("Stephen", 125);
		hm.put("Mark", 126);
		
		System.out.println(hm);
		System.out.println(hm.get("Mark"));
		
		for(String element:hm.keySet()) {
			System.out.println(element);
		}

		for(Integer element:hm.values()) {
			System.out.println(element);
		}
		for(String element:hm.keySet()) {
			System.out.println("key: "+element+"values:"+ hm.get(element));
		}


	}

}

