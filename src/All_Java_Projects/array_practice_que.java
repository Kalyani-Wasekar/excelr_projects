package All_Java_Projects;

public class array_practice_que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find max and min number from array..
		int[] array= {10,20,30,40,50,60};
		int max = array[0];
		int min= array[0];
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]>max) {
				max=array[i];
	
			}
			else if(array[i]<min) {
				min=array[i];
				
			}
			
		 
		}
		System.out.println("the max no is = "+max);
		System.out.println("the min no is = "+min);
		 
		 
	 

			
		}

	}
  // sort the array with sort function and without sort function.

