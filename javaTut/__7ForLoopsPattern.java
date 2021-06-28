package javaTut;

//import m.Ut;

public class __7ForLoopsPattern {

	public static void main(String[] args) {
	//	PATTERNS
		
		//	PRINT FOLLOWING
		/**
		 *	0)			 1)			2)			3)			4)
		 *	* * * *	*	 * 			* * * * *	* * * * *	        *
		 *	* * * *	*	 * *		  * * * *	* * * *		      * *
		 * 	* * * *	*	 * * *		    * * *	* * * 		    * * *
		 *	* * * *	*	 * * * * 	      * *	* * 		  * * * *
		 *	* * * *	*	 * * * * *			*	*			* * * * *
		 * 
		 **/
//		int n = Ut.inputint("Enter till");
		
//		0.)
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}		
		
//		1.)
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		2.)
//		for(int i = 0; i < n; i++) {
//			for(int k = 0; k < i; k++) {
//				System.out.print("  ");
//			}
//			for(int j = i; j < n; j++) {
//				if(j == n-1) {System.out.print("*");}else System.out.print("* ");
//			}
//			if(i < n-1) System.out.println();	
//		}
				
//		3.)
//		for(int i = n; i > 0; i--) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
//		4.)
//		for(int i = 0; i < n; i++) {
//			for(int k = 0; k < n-i-1; k++) {
//				System.out.print("  ");
//			}
//			for(int j = n-i-1; j < n; j++) {
//				if(j == n-1) {System.out.print("*");}else System.out.print("* ");
//			}
//			if(i < n-1) System.out.println();	
//		}
		
		//	ADVANCE PATTERNS
//		1.)					2.)							3.)	
//		        *			        1					*
//		      *   *			      2   3					* *
//		    *   *   *		    4   5   6				*   *		
//		  *   *   *   *		  7   8   9   10			*     *	
//		*   *   *   *   *	11   12   13   14   15		* * * * *	
		
		
 
 
 
 
 
		
//		1.)
//		for (int i = 0; i < n; i++) {
//			for(int k = 0; k < n-i-1; k++) {
//				System.out.print("  ");
//			}
//			for(int j = n-i-1; j < n; j++) {
//				if(j == n-1) {System.out.print("*");}else System.out.print("*   ");
//			}
//			if(i < n-1) System.out.println();	
//		}
		
//		2.)
//		int num = 1;
//		for (int i = 0; i < n; i++) {
//			for(int k = 0; k < n-i-1; k++) {
//				System.out.print("  ");
//			}
//			for(int j = n-i-1; j < n; j++) {
//				if(j == n-1) {System.out.print(num);}else System.out.print(num + "   ");
//				num++;
//			}
//			if(i < n-1) System.out.println();	
//		}
		
//		3.)
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j <= i; j++) {
//				if(j == i) {System.out.print("*");}else System.out.print("* ");
//			}
//			System.out.println();
//		}
//		for(int i = n-1; i > 0; i--) {
//			for(int j = 0; j < i; j++) {
//				if(j == i-1) {System.out.print("*");}else System.out.print("* ");
//			}
//			if(i == 1) {}else {
//			System.out.println();}	
//		}
		
//		4.)
//		for(int i = 1; i <= n; i++) {
//			if(i == n) {
//				for(int j = 0; j < i; j++) {
//					if(j == n) {System.out.print("*");}else System.out.print("* ");
//				}
//			}else {
//				for(int j = 0; j < i; j++) {
//					if((j == 0)||(j == i-1)) {System.out.print("* ");}else System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
	}
}
