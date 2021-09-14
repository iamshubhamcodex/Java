package javaTut;

import java.util.ArrayList;
//import java.util.List;

//	In this way we can make only one pair(String and int)
//class Pair{
//	int x;
//	String s;
//	
//	public Pair(String s, int x) {
//		this.s = s;
//		this.x = x;
//	}
//}

//class Pair<X, Y>{	//	in generics we can't pass int or all primitive data types, so to use all primitive data types with first character capital
//	X x;			//	Boolean, Integer, Long, Byte, Short, Float, Double, etc
//	Y y;
//	public Pair(X x, Y y) {	
//		this.x = x;
//		this.y = y;
//		//	now we can make many pair as we did not defined the data type
//	}
//}

public class _27ArrayList_Generics {

	public static void main(String[] args) {
		//	ARRAYLIST
		/**
		 *	The ArrayList class is an implementation of the List interface that allows us to create resizable-arrays. 
		 *	In Java, we need to declare the size of an array before we can use it. Once the size of an array is declared, it's hard to change it.
		 *
		 *	To handle this issue, we can use the ArrayList class. The ArrayList Class present in the java.util package allows us to create resizable arrays
		 *	Unlike arrays, ArrayList can automatically adjust it's capacity when we add or remove elements from it. Hence, ArrayList are also known as Dynamic Arrays.
		 *	
		 *	It doubles the size of array when given size exceeds
		 *
		 *
		 *	SYNTAX => ArrayList al = new ArrayList(); 
		 **/
		ArrayList<String> fruits = new ArrayList<>();	//	<Data Type> => is used when we want to store only one type of data
//		@SuppressWarnings("unused")
//		List<String> fruit = new ArrayList<>();			//	List is used bcz we are not making obj but defining type of obj(fruit)
//		//	Above Way of defining is recommend as List's child is LinkedList and etc so interconversion becomes easy
//		
//		
		fruits.add("apple");							//	It is called Generics. If we define Generics than we can not add other data types in ArrayList  
//		System.out.println();							//	If we do not define Generics than we can add anything or any data type
			
		/**
		 *	Methods of ArrayList 
		 * 		add(element)			//Adds one element to ArrayList
		 * 		add(element, index)		//Adds one element at given index to ArrayList
		 *  	addAll(Collection)		//Adds another Collection to current ArrayList()
		 *   	get(index)				//Gives the element at given index
		 *    	set(index, value)		//Sets the value of given index(or replaces the old)
		 *      remove(index)			//remove element of given index
		 *      removeAll(Collection)	//remove all element given in Collection
		 *      retainAll(Collection)
		 *      contains(Object)		//returns boolean
		 *      clear()					//empties the ArrayList
		 *      size()					//gives the size of ArrayList
		 *      contains()				//returns boolean, checks whether given thing is in Array List or not
		 *      isEmpty()				//returns boolean, checks length of ArrayList
		 *      toArray()				//returns Array of List
		 *      						//	SYNTAX => Object name[] = ArrayList.toArray();	
		 *      //	if we pass an array inside toArray() parenthesis then it returns that array with all Object  	
		 *		trimToSize()			//trims the size of ArrayList to current size
		 *		indexOf(Object)			//returns the index value of that object
		 *		lastIndexOf(Object)		//returns the last index value of that object
		 *		clone()					//returns a copy of current ArrayList
		 *		addAll(Collection)		//
		 **/
		
		
		//	QUESTION FROM GOOGLE
		/**MERGE INTERVAL INTERVIEW BIT GOOGLE**/
		
		/*Given a set of non-overlapping intervals, insert a new interval into the intervals(merge if necessary)*/
		//	apni kaksha arraylist
		
		//	watch again		
	}

}
