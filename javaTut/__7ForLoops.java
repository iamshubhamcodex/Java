package javaTut;

//import java.util.Scanner;

//import m.Ut.;

public class __7ForLoops {

	public static void main(String[] args) {
		//	LOOPS
		
	   /**
		 *  Loops are used to execute a set of statements repeatedly until a particular condition is satisfied
		 *	There are three types of LOOPS in JAVA:-
		 *		1.	For Loop
		 *		2.	While Loop
		 *		3.	Do-While Loop
		 **/
		
		//	FOR LOOPS
	   /**
		 *	SYNTAX:-	for(initialisation; condition; reinitialisation ){//CODE} 
		 */
		
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i);
//		}
		
		//	AIRTHMATIC SUM
//			//	BY FORMULA => (n*(n+1))/2
//			int num = Ut.inputint("Enter a Number");
//			System.out.println((num*(num+1)/2));
//			// 	BY FOOR LOOP
//			int sum = 0;
//			for(int i = 1; i <= num; i++) {		//	we can also use i-- for decrement 
//				sum+=i;
//			}
//			System.out.println(sum);
			
		//	PRINTING TABLE OF NUMBER
//		int table = Ut.inputint("Enter a Number");
//		for(int i = 1; i < 11; i++) {
//			if(i == 10) {System.out.println("Do it yourself");}else {
//			System.out.println(table + " * " + i + " == "+ table*i);
//			}
//		}
		
		//	PRINTING FACTORIAL
		
//		int no = Ut.inputint("Enter a Number for Factorial");
//		int result = 1;
//		
//		for(int i = no; i > 0; i--) {
//			result*=i;
//		}
//		System.out.println(result);
		
		//	PRINTING FIBBONACCI NUMBERS
		
//		int till = Ut.inputint("Enter number till to Print");
//		int fn = 0;
//		int sn = 1;
//		int temsum = 0;
//		
//		System.out.print(fn + " ");
//		System.out.print(sn + " ");
//		for(int i = 0; i < till - 2; i++) {
//			temsum = fn + sn;
//			fn = sn;
//			sn = temsum;
//			System.out.print(temsum + " ");
//		}
		
		//	X RAISE TO POWER Y
//		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		sc.close();
//		int result = 1;
//		
//		for(int i = 0; i < y; i++) {
//			result *=x;
//			System.out.println(result + " " + i);
//		}
//		System.out.println(result);
		
		//	PRIME NUMBER [there is property of any number that if there is any factor of a number than it will appear before under root of that number]
		
//		int a = Ut.inputint("Enter number to test Prime Number");
//		boolean ch = true;
//		if(a < 2) ch = false;	// We can write if code without {} for one line of code
//		int noOfTimes = 1;
//		for(int i = 2; i*i <= a ; i++) {
//			noOfTimes++;
//			if (a%i == 0) {
//				ch = false;
//				break;
//			}
//		}
//		if(ch) {
//			System.out.println("Is Prime");
//		}else{System.out.println("Not Prime");}
//		
//		System.out.println(noOfTimes);
		
	//	SERIES SUM OF TYPE 1 + 1/2 + 1/3 + ....... + 1/n
		
//		int inp = Ut.inputint("Enter till ");
//		double sum = 0.00;
//		
//		for(double i = 1.00; i <= inp; i++) {
//			double h = (1.00)/i;
//			sum+=h;
//		}
//		System.out.println(sum);
		
//		SERIES SUM OF TYPE 1 - 1/2 - 1/3 + ....... 1/n
		
//		int inp = Ut.inputint("Enter till ");
//		double sum = 0.00;
//		
//		for(double i = 1.00; i <= inp; i++) {
//			double h = (1.00)/i;
//			if(i%2 == 0) {
//				sum-=h;
//			}else {
//				sum+=h;		
//			}
//		}
//		System.out.println(sum);
		
		/**if we want to run for loop infinite time until unless a particular condition is not satisfied
		 *	so we write code as	=>	for(;;){//CODE (ln) if(condition){break;}} 
		 **/
		//	BREAK
		/**	
		 * Break keyword breaks the loop's iteration and comes out off loop
		 **/

		//	CODE for taking user input till user enters negative range
//		for(;;) {
//			int a = Ut.inputchar("Enter Number");
//			
//			if(a < 0) break;
//		}
		
		//	CONTINUE
		
		/**It is used to send loop's iteration to next value and does allow to run code below it**/
		
		//	CODE FOR => IF WE DOES NOT WANT TO PRINT NUMBER BETWEEN 40 and 50 SO:-
		
//		for(int i = 0; i < 100; i++) {
//			if(i > 40 && i <= 50) {
//				continue;
//			}
//			System.out.println(i);
//		}
	
		//	NESTIING 
			/**	We can also use nesting in loops**/
		
			//	If we are to print number from 1 to 100 then we use for loop
			//	but if we want to print number froom1 to 100 five times then??
			
//			for(int i = 0; i < 5; i++) {
//				for(int j = 0; j < 10; j++) {
//					System.out.print(j + " ");
//				}
//				System.out.println("");
//			}
		
		//	CODE FOR PRINTING TABLE TILL A NUMBER
		
//		for(int i = 1; i < 11; i++) {
//			int temp = 0;
//			for(int j = 1; j <= 10; j++) {
//				int sum = temp + i;
//				if(j == 10) {
//					System.out.print(sum);
//				}else {
//				System.out.print(sum + "\t");
//				temp = sum;
//				}
//			}
//			System.out.println("");
//		}	
		
		
	}
}
