package javaTut;

//import m.*;		

	/**	Import is used to import a function from another package to this package
	 * 	To use function in same package we can write as ClassName.functionName();
	 **/

public class _15Package_AccessModifier {

	public static void main(String[] args) {
		
		//	PACKAGE
		/**
		 *	A Java Package is a group of similar types of classes, interfaces and sub-packages.
		 *	There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc 
		 *
		 *	Uses:-
		 *		Java Package is used to categorize the classes and interfaces so that they can be easily maintained
		 *		Java Package provides access protection
		 *		Java Package removes naming collision
		 **/
		
		/**import keyword**/
//		int[] h = {4,6,8,6};
//		System.out.println(_13Methods.avgMarks(h));
		
		
		//	ACCESS MODIFIERS
		
		/**	The access modifiers in Java specifies the accessibility or scope of a field , method, constructor or class.
		 *  We can change the access level of fields, constructors, methods and class by applying the access modifier on it
		 * 
		 * 	There are four types of Java access modifiers:-
		 * 		1.PRIVATE ==> 	The access level of a private modifier is only within the class. It cannot be accessed from outside the class
		 * 		2.DEFAULT ==>	The access level of a default modifier is only within the package. It cannot be accessed from the outside the package.
		 * 						If you do not specify any access level, it will be the default.
		 * 		3.PROTECTED ==>	The access level of a protected modifier is within the package and outside the package through child class.
		 * 						If you do not make the child class it cannot be accessed from outside the package
		 *		4.PUBLIC ==>	The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.
		 **/	
	}

}
