package javaTut;

//class Persons{
//	protected String name;
//	static String breed = "Homo Sapiens";
//	
//	public Persons() {
//		
//	}
//	public Persons(String name) {	//	Since CONSTRUCTOR is like a methods but it does not return any thing
//		this.name = name;
//	}
//	public void eat() {
//		System.out.println(this.name + " is eating" );
//	}
//	public void walk() {
//		System.out.println(this.name + " is walking" );
//	}
//}
//class Teacher extends Persons{
//	public void teach() {
//		System.out.println("Teacher " + name + " is teaching");
//	}
//}
//class Singer extends Persons{
//	public void eat() {
//		System.out.println("Singer " + name + " is eating");
//	}
//	public void sing() {
//			//	since name is protected so to access it we must make person class child that is by using extends keyword
////				and similarly it is available to class singer. and if we remove extends keyword then name will not be visible
////				to Singer class
//		System.out.println(this.name + " is singing");
//		
//		/**	 If same methods is created in parent and child then child's method will overwrite parent's method**/
//	}
//}


/**for super keyword**/
//class Coder extends Person{
//	public Coder(String name) {
//		super(name);	//	super keyword can be used inside blocks	{}
//		System.out.println(super.getName());
//	}
//}

public class _18Inheritance {

	public static void main(String[] args) {
		// INHERITANCE

		/**
		 * Inheritance is an is-a relationship. We use inheritance only if an is-a
		 * relationship is present between the two classes ex:- a car is a vehicle a
		 * bike is a vehicle
		 *
		 * an apple is fruit an orange is fruit
		 **/

//		Singer s = new Singer();
//		s.name = "Harry";
//		s.sing();
//		s.eat();

	
	//	UPCASTING AND DOWNCASTING
	
		/**Upcasting is like typecasting but here casting is done of classes
		 	Similar is Downcasting**/
	
//	Singer s1 = new Singer();
//	Persons p1 = s1;		//	UPCASTING as singer is person so obj of person can be made
////	Teacher t1 = (Teacher)p1;	//	on running this code you will get error bcz p1 is instance of singer so when we do this then indirectly we are making
//								//	Teacher t1 = new Singer(); that is absolutely wrong[ERROR:- Singer cannot be cast to class javaTut.Teacher]
////	Singer s2 = p1;		//	this will also give compile time error bcz person can be teacher or singer so we have to specify it
//	@SuppressWarnings("unused")
//	Singer s2 = (Singer)p1;
	
//		Persons p1 = new Persons();
//		Teacher t1 = (Teacher)p1;//	It will give error as person can be singer also 
	
	
	//	SUPER KEYWORD
		/**
		 *	In java, super keyword is used to refer to immediate parent class of a child class. In other words super keyword is used by subclass whenever
		 *	it need to refer to its immediate super class 
		 *
		 *	It is used when  parent is in different class and child is in other class
		 *	like Person class in staticKeyword
		 **/
		
//		Coder c = new Coder("Shubham");
		
	}

}
