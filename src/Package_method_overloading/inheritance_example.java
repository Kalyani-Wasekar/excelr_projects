package Package_method_overloading;
// how interface works,
interface interface_1{
	//variables- by default static and final(even you don't declare)
	//methods--abstract(without the body) and public
	int i=50;
	void interfacemethod();
}
interface newinterface{
	void newinterfacemethod();
}
class interface_2 implements interface_1,newinterface{

	@Override
	public void interfacemethod() {
		System.out.println("interface 1 ");
		
	}

	@Override
	public void newinterfacemethod() {
		// TODO Auto-generated method stub
		System.out.println("interface 2 ");
	}
	
	public void classmethod() {
		System.out.println("class methods ");
	}
	
}


public class inheritance_example {
	
	final static int a=50;

	public static void main(String[] args) {
		
		
		interface_2 obj=new interface_2();
		obj.classmethod();
		obj.interfacemethod();
		obj.newinterfacemethod();

	}

}




