package Java_Assignment;



public class que_3_shape {
	// Base class
	class Shape {
	    public void printShape() {
	        System.out.println("This is shape");
	    }
	}

	// Subclass of Shape
	class Rectangle extends Shape {
	    public void printRectangle() {
	        System.out.println("This is a rectangular shape");
	    }
	}

	// Another subclass of Shape
	class Circle extends Shape {
	    public void printCircle() {
	        System.out.println("This is circular shape");
	    }
	}

	// Subclass of Rectangle
	class Square extends Rectangle {
	    public void printSquare() {
	        System.out.println("Square is a rectangle");
	    }
	}

	// Main class to test the hierarchy
	public class Main {
	    public void main(String[] args) {
	        // Creating an object of Square
	        Square square = new Square();

	        // Calling methods from Shape and Rectangle classes using Square object
	        square.printShape();      // Method from Shape class
	        square.printRectangle();  // Method from Rectangle class
	        square.printSquare();     // Method from Square class
	    }
	}
}


	
