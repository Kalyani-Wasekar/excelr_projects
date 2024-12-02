package Package_method_overloading;

abstract class shape{
	
	void draw() {
		System.out.println("draw shape");
	}
	abstract void area();
	
}

class rectangle extends shape
{

	@Override
	void area() {
		System.out.println("rectangle area");		
	}
	}

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle rect=new rectangle();
		rect.draw();
		rect.area();
	}

}
