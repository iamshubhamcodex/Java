package javaTut;


//import m.Ut;

//interface YouTuber {
//	void makeVideos();	//	public, abstract is default
//	default void uploadVideos() {
//		System.out.println("Video Uploading");	//	in normal way it will throw error so we can use default keyword
//	}											//	now after default we need not to implement it to all children it  
//}												//	is defined here and can be used everywhere
//
/**Since  makeVideos function is in YOUTUBER and implements to Student so we can face diamond problem
   so we need to define it to Person class @override so it will be overridden and no diamond problem**/
//interface Student {
//	void study();
//}
//
//class hi {
//
//}
//
//class Person extends hi implements Student, YouTuber {
//
//	@Override
//	public void makeVideos() {
//		System.out.println("Person is making Videos");
//	}
//
//	@Override
//	public void study() {
//		System.out.println("Person is studying");
//	}	
//	@Override
//	public void uploadVideos{
//		System.out.println("Person is Uploading Videos");
//	}
//}
//
public class _24Interfaces {

	public static void main(String[] args) {
		// INTERFACES

		/**
		 * Interface defines a set of specifications that other classes must implement
		 * interface Polygon{public void getArea();} Here, Polygon is an interface. We
		 * have used the interface keyword to declare an interface.
		 *
		 * It is used to implements one or more interfaces because we can not extends
		 * more than one class in Java so if we want to import two or more property of another
		 * class than we declare them as interface and then implement them
		 **/

	    /**
		 *	Why use Interfaces? 
	     *		• Interfaces provide specifications that a class (which implements it) must follow. 
	     *		• Similar to abstract classes, interfaces help us to achieve abstraction in Java. 
	     *		• In Java, multiple inheritance is not possible by extending classes. However, a class can implement 
	     *		  multiple interfaces. This allows us to get the functionality of multiple inheritance in Java. 
	     *		 
		 **/
//		Person p = new Person();
//		p.uploadVideos()
//		p.study();
//		p.makeVideos();
		
	    /**
		 *	Few important points about Interfaces: 
		 *		1. We can't instantiate an interface in java. 
		 *		2. We can't instantiate Interfaces because they don't have constructors and interfaces can't have a method with body. 
		 *		3. By default, any attribute of interface is public, static and final, so we don't need to provide access modifiers to the attributes but if 
		 *		we do, compiler doesn't complain about it either. 
		 *		4. By default interface methods are implicitly abstract and public, it makes total sense because the method don't have body and so that subclasses can provide the method implementation.  
		 *		5. An interface can't extend any class but it can extend another interface. 
 		 *		6. A class implementing an interface must provide implementation for all of its method unless it's an abstract class.
 		 **/
		
//		YouTuber yt = p;	//	UPCASTING
//		yt.makeVideos();	//	since we make person a youtuber so person's function is restricted to a YOUTUBER
//		yt.study();	
		get();
	}
	public static void get() {

	}
}
