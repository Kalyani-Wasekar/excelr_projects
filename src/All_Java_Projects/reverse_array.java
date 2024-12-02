package All_Java_Projects;

public class reverse_array {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int array[] = {1,2,2,2,4,5,6};

	        System.out.print("reverse the array ");
	        for (int i = 0; i < array.length; i++) {
	        	boolean isunique=true;
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] != array[j] && i!=j) {
	                    isunique=false;
	                }
	            }
	            
	           if(isunique) {
	        	   System.out.println(array[i+1]);
	        }
	    }
	}


}
// create two different arrays and find common elements from array