package javaTut;


//class Animal{
//	
//}
//class Pet extends Animal{
//	String name = "Pet";
//	public void walk() {
//		System.out.println("Pet is walking");
//	}
//}
//class Dog extends Pet{
//	String name = "Dog";
//	public void walk() {
//		System.out.println("Dog is walking");
//	}
//}


public class _21Polymorphism {

	public static void main(String[] args) {
		// POLYMORPHISM
		
		/**
		 *	Polymorphism means multiple forms accept karne wala
		 *	Polymorphism allows us to perform a single action in different ways. In other words, polymorphism
		 *	allows you to define one interface and have multiple implementations.
		 **/
		
		/**RUNTIME POLYMORPHISM
		 * 
		 *	It is also known as Dynamic binding. Late binding and overriding as well. 
		 *	Overriding is run-time polymorphism having same method with same parameters or signature, but associated in a class & its 
		 *	subclass. 
		 *	Slower execution 
 		 *
 		 *	Variable Name can not be overridden it can only be hidden
		 **/
//		Dog d = new Dog();
//		
//		Pet p = d;			//	since p is instance of dog so walk in pet will get overridden by dog
////		Pet p = new Pet();
//		Animal a = d;
//							//	multiple form of dog (d)	1 at animal and 2 at pet
//		d.walk();
//		p.walk();
//		System.out.println(d.name);		prints dog.name = dog
//		System.out.println(p.name);		prints pet.name = pet
		
		
		/**COMPILE TIME POLYMORPHISM
		 *	It is also known as Static binding. Early binding and overloading as well. 
		 *	Overloading is compile time polymorphism where more than one methods share the same name with different parameters or signature and different return type. 
		 *	Faster execution 
		 **/
//		greetings();
//		greetings("Good Morning");
		
		
	}
	
	/**COMPILE TIME POLYMORPHISM**/
//	public static void greetings() {
//		System.out.println("Hi there");			multiple form of greetings
//	}
//	public static void greetings(String s) {
//		System.out.println("Hi there. " + s);
//	}

}
