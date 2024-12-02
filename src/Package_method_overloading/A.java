package Package_method_overloading;

public class A {
    void m1() {
    	System.out.println("m1");
    }
    void m1(int a) {
    	System.out.println("overloadig method");
    }
    
	public static void main(String[] args) {
		// performing overloading...
     A a=new A();
     a.m1();
     a.m1(2); 
 	// performing overriding...
 	 B b=new B(); 
 	 b.m1(4);  
	}
}



