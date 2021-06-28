package javaTut;

public class _23Final {	
	//	final
	
//	final int ROLL_NO = 8;	//	it only show error in class if variable is not initialized
	
	
	public static void main(String[] args) {
		
		//	FINAL KEYWORD
		
		/**
		 *	Final is used for no changes later
		 *
		 *	final in variable means the value of variable can not be changed
		 *	final in class means now no more children of that class can be made
		 *	final in methods means now we can not overwrite it
		 *
		 *	FINAL VARIABLES
		 *		A final variable can only be initialized once
		 *		We must initialize a final variable, otherwise compiler will throw compile-time error
		 *		It is a good practice to name final variable in all CAPS
		 *		A final variable is called blank final variable , if it is not initialized while declaration.
		 *		In case of a reference final variable, internal state of the object pointed by that reference variable can be changed 
		 **/
//		@SuppressWarnings("unused")
//		final String name = "Anuj";
//		name = "Kumar";	It will throw compile-time error
		
//		final int IH;		//	since it is local variable so it will not throw error
//		IH = 0;
//		System.out.println(IH);
		
	   /**
		 *	object variable can not be changed but it's internal value can be changed
		 *	means object is instance of a class so obj can not be changed but values inside classes can be changed
		 **/
	}

}
