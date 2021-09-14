package javaTut;

//import java.util.Arrays;
//import m.Ut;

public class _11Strings {


	
	
	public static void main(String[] args) {
		//	STRINGS
		
	   /**
		 * Strings are for storing alphabets or words. It is non-primitive data type
		 * Strings are not mutable(that is it can not be changed) but if you change it will make another new string with changed value
		 * and previous string is still in the storage
		 *	SYNTAX => 	String variableName = "value";
		 *		OR =>	String variableName = new String("value");		//	it creates new object of STRING but not optimized creates two variables
		 *																//	one in pool area and another and heap area(pool area is area for STRINGS)
		 **/
		
		
		//	STRINGS METHODS
		
//		1.)	String(char[] val) => returns a new string with that chars
//		2.)	String(char[] val, int offset, int length) =>	returns a new subString from offset to length
		//	REFER TO STRING CLASS
		
//		String name1 = "Anuj";
//		String name2 = "Anuj";
//		String name3 = "Anuj";
//		char[] chaar = {'k','h','q', 'h', 'g', 'u'};
//		System.out.println(name1 == name2);
//		System.out.println(name2 == name3);
//		String ng = new String(chaar);
//		String[] ss = ng.split("h", 2);
//		System.out.println(ss.length);
//		char c = ng.charAt(4);
//		String f = ng.substring(1);
//		String w = ng.substring(1, 4);
//		boolean u = ng.contains("hqh");
//		boolean o = ng.equals("hqh");	//	STRINGS DOES NOT EQUALS IN GENERAL WAY USE THIS
//		String t = ng.trim();	//	toLowerCase and to UpperCase
//		for(int i = 0; i < ss.length; i++) {
//			System.out.println(ss[i]);
//		}
//		System.out.println(ss[0]);
//		String uu = "91";
//		int ii = 91;
//		System.out.println(Ut.list("hi how are you")[5]);
	
	
		//	ADVANCED STRING QUESTIONS
	
	
		//	ANAGRAMS	=>	watch aman dhattarwal(apni kaksha)'s anagram
//		String s1 = Ut.inputStr("Enter string 1");
//		String s2 = Ut.inputStr("Enter string 2");
//		if(s1.length() == s2.length()) {
//			char[] c1 = Ut.list(s1);
//			char[] c2 = Ut.list(s2);
//			
//			Arrays.sort(c1);
//			Arrays.sort(c2);
//			String s11 = new String(c1);
//			String s12 = new String(c2);
//			
//			System.out.println(s11 + " " + s12);
//			if(s11.equals(s12)) {
//				System.out.println("Is Anagram");
//			}else System.out.println("Not Anagram");
//		}else System.out.println("Not Anagram");
	
		
		
		//REVERE WORD BY WORD
		/**WATCH JAVADSALGO 27 LEC**/
		
		
//		System.out.println(Ut.revStrWp("I love         Java, the coffee"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
