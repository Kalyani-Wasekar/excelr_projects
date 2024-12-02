//package All_Java_Projects;
//
//public class string_buffer_builder_demo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// string buffer can be mutable 
//		StringBuffer S1= new StringBuffer("hello");
//		StringBuilder S2= new StringBuilder("hi");
//		S1.append("class");
//		
//		System.out.println(S1);
//		String name= "john";
//		name.concat("peter");
//		System.out.println(name);
//		System.out.println(S1.replace(5, 10, "everyone"));
//		System.out.println(S1.delete(5, 13));
//		System.out.println(S1.insert(5, "java"));
//		//System.out.println(S1.reverse());
//		S1.setCharAt(0, 'm');
//		System.out.println(S1);
//		String S3=S2.toString();
//		
//		
//		
//		
//	}
//
//}
//to calculate the total no of characters in the string by iterating the string

//package All_Java_Projects;
//
//public class string_buffer_builder_demo {
//	public static void main(String[] args) {
//		String S1 ="anu";
//		int count=0;
//		for(int i=0;i<=S1.length()-2;i++) {
//		
//			count=count+1;
//		}
//		System.out.println(count);
//		
//	}
//}

// find how many a are present in string
package All_Java_Projects;

public class string_buffer_builder_demo {
	public static void main(String[] args) {
		String S1 ="anupama";
		int count=0;
		for(int i=0;i<=S1.length()-1;i++) {
		if (S1.charAt(i)=='a') {
			count=count+1;
			
			
		}
		
		
			
		}
		System.out.println("no of a in string = "+ count);
		
		
	}
}


	
