package All_Java_Projects;



import java.util.PriorityQueue;

public class queque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		
		pq.add("java program");
		pq.add("c program");
		pq.add("python program");
		
		
		System.out.println(pq);
		
		for(String element:pq) {
			System.out.println(pq);
		}
		
		pq.add("apple");
		System.out.println(pq);
		
		

	}

}

