package All_Java_Projects;

import java.util.Arrays;

public class array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array are collection of data with same datatype
		// store multiple values 
		// array is mutable
		int array1[]= {10,20,30};
		//array1.length int - int[];
		double avg;
		int sum = 0;
		for(int i=0;i<array1.length-1;i++) {
			sum+=array1[i];
		}
		avg=sum/array1.length;
		System.out.println(avg);
		Arrays.sort(array1);
		for (int values:array1) {
			sum=sum+values;
			System.out.println(values);
			System.out.println(sum=sum+values);
			
		}
		byte a=(byte) -129;
		System.out.println(a);
		int b=20;
		byte c=(byte) b;
		
	}

}


