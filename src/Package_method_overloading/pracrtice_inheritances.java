package Package_method_overloading;

//create interface animal with methods eat and walk and Implement 
//it in herbivore and carnivore class. 
//make cow and dog child class for the herbivore class 
//and override the methods implemented. add class lion 
//and tiger as child for carnivore and override those methods.

interface animal{
	void eat();  // not body(as it's abstraction.)  
    void walk();
}
class herbivore implements animal{

	@Override
	public void eat() {
		System.out.println("hervivores can eat");
		
	}

	@Override
	public void walk() {
		
		System.out.println("hervivores can walk");
	}
	
}
class omnivore implements animal{

	@Override
	public void eat() {
		System.out.println("omnivores can eat");
		
	}

	@Override
	public void walk() {
		System.out.println("omnivores can walk");
		
	}
	
}

class lion extends omnivore{
	@Override
	public void eat() {
		System.out.println("lion can eat");
		
	}

	@Override
	public void walk() {
		System.out.println("lion can walk");
		
	}
	
}
	class tiger extends omnivore{
	@Override
	public void eat() {
		System.out.println("Tiger can eat");
		
	}

	@Override
	public void walk() {
		System.out.println("Tiger can walk");
		
	}
	}
	
	class dog extends herbivore{
		@Override
		public void eat() {
			System.out.println("dog can eat");
			
		}

		@Override
		public void walk() {
			System.out.println("dog can walk");
			
		}
		
	}
		class cow extends herbivore{
		@Override
		public void eat() {
			System.out.println("cow can eat");
			
		}

		@Override
		public void walk() {
			System.out.println("cow can walk");
			
		}
		}
		


	
public class pracrtice_inheritances {

	public static void main(String[] args) {
	 herbivore herbi =new herbivore();
     herbi.eat();
     herbi.walk();
	 omnivore omni =new omnivore();
     omni.eat();
     omni.walk();
     dog d=new dog();
     d.eat();
     d.walk();
     lion l=new lion();
     l.eat();
     l.walk();
	}

}



