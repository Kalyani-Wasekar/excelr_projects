package Package_method_overloading;

class women{
	void cook() {
		System.out.println("women can cook"); 
	}
	void fight() {
		System.out.println("women can fight");
	}
}
class teacher extends women{
	void cook() {
		System.out.println("teacher can cook"); 
	}
	void teach() {
		System.out.println("teacher can teach"); 
	}
	void teach(String sub) {
		System.out.println( "teacher can teach this subject");
	}
}

public class polymorphism {

	public static void main(String[] args) {
		
		teacher t=new teacher();
		t.cook();
		t.fight();
		t.teach();
		t.teach("computer");
		//runtime polymorphism-- overriding after running your program jvm will call 
		//the overrridden method.
		//compile time polymorphism-- overloading- compiler itself will tell which method to call
	}

}

