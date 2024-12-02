package Java_Assignment;

public class que_4_method {
	// Parent class
	class Parent {
	    public void printParent() {
	        System.out.println("This is parent class");
	    }
	}

	// Child class inheriting from Parent
	class Child extends Parent {
	    public void printChild() {
	        System.out.println("This is child class");
	    }
	}

	// Main class to test the functionality
	public class Main {
	    public void main(String[] args) {
	        // 1 - Create an object of Parent class and call its method
	        Parent parent = new Parent();
	        parent.printParent();  // Output: This is parent class

	        // 2 - Create an object of Child class and call its method
	        Child child = new Child();
	        child.printChild();    // Output: This is child class

	        // 3 - Call the method of Parent class using the object of Child class
	        child.printParent();   // Output: This is parent class
	    }
	}
}


	
