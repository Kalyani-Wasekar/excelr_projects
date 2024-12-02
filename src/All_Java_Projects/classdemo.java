package All_Java_Projects;

public class classdemo {
static int x=20;

	static public void login() 
	{
		System.out.println(x);
		System.out.println("login");
	}
	public void logout() {
		System.out.println("logout");
	}
	
	public int add() {
		int a=10;
		int b=20;
		return (a+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		classdemo obj=new classdemo();
	    login();
		obj.logout();
		System.out.println(obj.add());
		x=50;
		System.out.println(x);
		
		StringBuilder S1=	new StringBuilder("hello");
		S1.append("hi").reverse();
		System.out.println(S1);
		
		
	}

}
class A{
	
}