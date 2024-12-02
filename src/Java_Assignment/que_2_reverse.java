package Java_Assignment;

public class que_2_reverse {
	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				 String str =" Java Programming";
			        
			        // adding extra space at the end.
			        str = str+ " ";
			        String word = " ",rev = " ";
			        // for(int i=0; i<str.length()-1; i++){  -- if we only want to reverse the word in reverse position in sentence. 
			         for(int i=str.length()-1 ;i>=0;i--){  // if we want to reverse the word also.
			            char ch = str.charAt(i);
			         //Forming each word.
			            if(ch!=' '){
			                word = word + ch;
			   }
			            //Adding the formed word to the rev variable to reverse it.
			            else {
			                rev = word +" "+ rev;
			                word="";
			            } 
			        }
			      //Printing the reversed sentence.
		System.out.println("Reversed sentence: " + rev);
			  }
		

		

}

