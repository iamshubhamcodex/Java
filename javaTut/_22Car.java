package javaTut;

public abstract class  _22Car {
//	public void accelerate() {
//		
//	}
//	public void breaking() {
//		
//	}
	//	Since Car is a concept and not actually a object therefore it will not have it's own methods then
	
	public abstract void accelerate();		//	ABSTRACT METHOD
	public abstract void breaking();
	
//	using abstract keyword, we can not create object of a concept as it was not actually a real Car
//	We can also make non-abstract method inside an abstract class that will not be need to be implemented in it's child
	public void honk() {
		System.out.println("Car is honking");	//	CONCRETE METHOD
	}
}
