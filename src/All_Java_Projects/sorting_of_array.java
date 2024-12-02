package All_Java_Projects;

public class sorting_of_array {
	public static void main(String[] args) {
		int array[]= {10, 45, 67, 56 ,89, 68 ,78};
		
		int temp;
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if (array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
						
					
			
				}
				
				
			}
		    
			
			
		}
		for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+" ");
		}
	}

}
