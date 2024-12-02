package Package_method_overloading;

class person{
	private String name="john";
	private int age=28;
	
	public void getname() {
		System.out.println(name);
	}
	public void age_get() {
		System.out.println(age);
	}
	public void setname() {
		name="george";
		System.out.println(name);
	}
	
}
public class encapsulation {

	public static void main(String[] args) {
	
		//It's just like binding the data.
		person p=new person();
		p.getname();
        p.age_get();
        p.setname();
	}

}
