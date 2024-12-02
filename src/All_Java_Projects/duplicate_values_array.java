package All_Java_Projects;

public class duplicate_values_array {

 

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int array[] = {10, 10, 40, 50, 50, 50, 60, 60};

	        System.out.print("Duplicate values in the array: ");
	        for (int i = 0; i < array.length ; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] != array[j]) {
	                    System.out.print(array[j] + " ");
	                    break; // To avoid printing duplicates more than once
	                }
	            }
	        }
	    }
	}
