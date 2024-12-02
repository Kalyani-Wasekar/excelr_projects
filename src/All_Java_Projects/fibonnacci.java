package All_Java_Projects;

public class fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,i=1;
		System.out.print(a + " ");
		while(i < 10) {
			System.out.print(b+" ");
			int next_value = a+b;
			a=b;
			b=next_value;
			i++;	
	}

}
}
