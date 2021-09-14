package javaTut;

//class Person {
//	static String breed = "Homo Sapiens";
//	private String name;
//	
//	protected Person(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//	public Person() {}
//}

public class _17StaticKeyword {

//	static {		
//		System.out.println("I am above the Main Block");
//		int i = 0;
//	}

	
	public static void main(String[] args) {
//		System.out.println("I am in Main Block"); // For Static Block

		// STATIC KEYWORD
		/**
		 * The keyword static indicates that the particular member belongs to a type
		 * itself, rather than to and instance of that type. It is mainly used to help
		 * memory management.
		 *
		 * The keyword can be applied to variable, methods, blocks and nested class. It
		 * is related to class not to object As static keyword is related to class so it
		 * does not change with change in objects // we can change it also
		 *
		 **/

//		Person p = new Person();
//		Person.breed = "hi";
//		System.out.println(p.breed);
//		System.out.println(Math.PI);		//	read Math.class

		/**
		 * We can not declare a top-level class with static modifier, but we can declare
		 * a nested class as static.
		 *
		 * In Java you can define a class within another class. Such a class is called
		 * nested class. Nested class are or two types: static and non-static We declare
		 * nested class bcz that class is related to upper class closely and giving it
		 * static means we can create child class's object without creating object of upper class's object
		 * 
		 * If we want to create obj of static class inside a non static class so we does
		 * not need to create class of upper class
		 **/

		// STATIC BLOCK

		/**
		 * These are the blocks which get executed before execution of main method
		 * 
		 * SYNTAX => static{//CODE} if we do not write static it will act as normal
		 * block
		 **/
		
	}

//	static {
//		int i = 0;
//		System.out.println("I am below the Main Block");
//	}
}