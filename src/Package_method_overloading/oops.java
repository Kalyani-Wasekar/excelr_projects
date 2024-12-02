package Package_method_overloading;

public class oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// oops classes - to access the methods in the class you create a boject
		// polymorphism, inheritance, encapsulation, abstraction, interface
		// inheritance - parent (super), class, child(sub) class
		
          Y objb=new Y();
          objb.a=100;
          System.out.println(objb.a);
          objb.parentmethod();
          objb.childmethod();
          Z obj=new Z();
          
          
	}

}
// parent
class X{
	int a=50;
	void parentmethod() {
		System.out.println("parent class");	
		System.out.println();}
	
}
// child
class Y extends X{
	void childmethod() {
		System.out.println("chlid class");
	}
	
}
// multilevel- subclassess can access other subclasses by inheriting them

class Z extends Y{
	void multilevel() {
		System.out.println("multilevel");
		
	}
	
}
//hierarchial -- one parent can have many child.
class i{
	
}
class j extends i{
	
}
class k extends i{
	
}

// multiple inheritance a-- b, c -- has inherit both a and b as parent b-- interface

// hybrid -- combine 2 inheritance
//hybrid-- combine 2 inheritance
/* class i{} */
/*
* class j extends i{} class k extends i{} class m extends k{}
*/