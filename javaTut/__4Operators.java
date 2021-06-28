package javaTut;

public class __4Operators {

	public static void main(String[] args) {
		//	OPERATORS
		
	   /**
		 *	Operators are just operation between two values
		 *
		 *	There are 5 types of OPERATORS:-
		 *		1.	Arithmetic
		 *		2.	Bitwise
		 *		3.	Assignment
		 *		4.	Comparison
		 *		5.	Logical
		 **/
		
	   /**
		 *	1.	Arithmetic:-
		 *		like +, -, *, /, %, ++, --(gives the remainder)
		 *			(REMEBER IF ++ OR -- written before variable than value is increased at that line
		 *				but if ++ or -- written after variable than value is increased after that line)
		 *	
		 **/

//		int a = 13;
//		int b = 7;
//		System.out.println(a%b); // gives 6 as remainder
//	
//
//		int c = b++;	//	remember value of b is 7 and will be increased after this line
//		System.out.println(c);
//		int d = ++b;	//	but value of d will be 1 + b as value of b is increased at this line 
//		System.out.println(d); //	=> value of d = 2+b as b is increased twice before this line
		
		
	   /**
		 *
		 *	2.	Bitwise:-
		 *		like |(or), &(and)
		 *		it works on bits(like if we give two no. and do bitwise operation than 
		 *			no.s will be first converted to bits[01] and bit operation will be done 
		 *			and final bit will be converted to a number )
		 *		ex:- 4[in bit === 100] and 5[in bit 101]	so bit and or bit or will each digit in bits and
		 *			will do and/or bit operation ==>  [4 | 5]  = 100
		 *														 101	so at last digit 0 or 1 ==> 1
		 *			so at last second digit 0 or 0 ==> 0, so at first digit 1 or 0 ==> 1
		 *			and bit number formed is 101 that is 5		
		 *													
		 *			I  AM SKIPPING BITWISE LEFT AND RIGHT SHIFT
		 **/
//		int b1 = 4;
//		int b2 = 5;
//		int b3 = 9;
//		int b4 = 8;		
//		System.out.println(b3&b4);
//		System.out.println(b1|b2);
				
	   /**
		 *
		 *	3.	Assignment:-
		 *		like =, +=, -=, *=, /=, &= it assign a value to a variables
		 *			{for ex a+=2 means a = a + 2, a-= means a = a - 2}
		 *
		 **/
		
//		int a1 = 6;
//		int a2 = 4;
//		System.out.println(a1+=3);
//		System.out.println(a2/=2); //	=>	a1 = a1/2	=>	a1 = 6 +   
		
	   /**	
		 *	4.	Comparison:-
		 *		like <, >, == 
		 *		it compares two number and will return 
         *
         **/
//		System.out.println(3<7);
		
		
	   /**
		 *	5.	Logical:-
		 *		like && and ||
		 *		it is equal to & and | operators but in this it uses logic like if first condition is false
		 *		in && operator then result will be false so it does not check second number SIMILARLY if first 
		 *		value is true in || operator than it will not check second value
		 *
		 * 		It is SLIGHTLY faster than Bitwise Operators
		 **/
//		boolean l1 = true;
//		boolean l2 = false;
//		System.out.println(l2 && l1);	//	we can not check how it works but it is faster
	
		
	}

}
