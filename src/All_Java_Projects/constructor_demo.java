package All_Java_Projects;

public class constructor_demo {
	constructor_demo(){
		System.out.println("default const");
		
	}
	constructor_demo(int a){
		System.out.println("int const");
		
	}
	constructor_demo(int a, int b){
		System.out.println("2 para const");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        constructor_demo obj1=new constructor_demo();
	}

}
// constructor can not be overwrite
// create two methods and overload both the method and override one method in child class
