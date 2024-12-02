package All_Java_Projects;

public class class_practice {
	  static int  a= 10;
	  static int b= 20;
	  public static void add() {
		  System.out.println(a+b);
		  
		  
		  
	  }
	  public void sub() {
		  System.out.println(a-b);
	  }
	 public int mul() {
		 int mul= a*b;
		return (mul);
		
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create add, sub, and mul methods in which mul is a return type
		//add- static method,in all the methods write the logics with an 
		//output. Have instance variables a,b
		class_practice obj=new class_practice();
		add();
		obj.sub();
		System.out.println(obj.mul());
		
		
    

	}

}

//  assignment:- find the duplicate values in the array...