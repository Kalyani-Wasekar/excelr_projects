package All_Java_Projects;

public class prime_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=32,c=0;
	     for(int i=1;i<=a;i++) {
	    	 if(a%i==0) {
	        	 c=c+1;
	    	 }
	    	 
	    	 }
	     if(c==2) {
	    	 System.out.println("it is prime");
	    	 
	     }
	     else {
	    	 System.out.println("it is not prime");
	     }
		}
	}


