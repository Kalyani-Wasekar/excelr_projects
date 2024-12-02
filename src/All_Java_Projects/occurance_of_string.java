package All_Java_Projects;
//
//public class occurance_of_string {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// find occurance of alphabet in string using char array...
//		String S1= "Java Programming";
//		char array[] = S1.toCharArray();
//		int count=0;
//		for(int i=0;i<array.length;i++) {
//			if(array[i]== 'a') {
//				count++;
//				
//				
//			}
//		}
//		System.out.println("the occurance of a = "+count);
//
//	}
//
//}
// assignment :- print each and every char occurrence on string..
public class occurance_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find occurance of alphabet in string using char array...
		String S1= "Java Programming";
		char array[] = S1.toCharArray();
		int count=0;
		for(char c : S1.toCharArray()) {
			if( array[c]==S1.charAt(count)) {
				count++;
				
				
			}
		
		}
		System.out.println("the occurance of a = "+count);

	}

}