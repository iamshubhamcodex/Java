package javaTut;

//import java.util.HashSet;
//import java.util.Set;

public class _36Recursion {

//	static int stepCount = 0;

	// FIND SUM OF FIRST N NATURAL NUMBERS USING RECURSION.
//	static int sum(int n) {
//		if (n == 1)
//			return 1;
//		return n + sum(n - 1);
//	}

	// CALCULATE POWER USING RECURSION a ^ b. + FAST POWER
//	static int power(int n, int a) {
//		stepCount++;
//		if (n == 0)
//			return 1;
//		return a * power(n - 1, a);
//	}

	// CALCULATE POWER USING RECURSION a ^ b. + FAST POWER
//	static int fastpow(int a, int b) {
//		stepCount++;
//		if (b == 0)
//			return 1;
//		if ((b % 2) == 0)
//			return fastpow(a * a, b / 2);
//		return a * fastpow(a, b - 1);
//	}

	// FIND ALL THE PATHS IN A NXM(N by M) MATRIX
//	static int path(int n, int m) {
//		if (n == 1 || m == 1)
//			return 1;
//		return path(n, m - 1) + path(n - 1, m);
//	}

	// FLOOD FILL
//	static void floodFill(int a[][], int r, int c, int toFill, int prevFill) {
//		int rows = a.length;
//		int cols = a[0].length;
//		if (r < 0 || r >= rows || c < 0 || c >= cols ||(a[r][c] != prevFill))return;
//		a[r][c] = toFill;
//		floodFill(a, r - 1, c, toFill, prevFill);
//		floodFill(a, r + 1, c, toFill, prevFill);
//		floodFill(a, r, c - 1, toFill, prevFill);
//		floodFill(a, r, c + 1, toFill, prevFill);
//	}
//	static void printMat(int a[][]) {
//		int rows = a.length;
//		int cols = a[0].length;
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}	
//	}
	
	// PERMUTATION OF A STRING
//	static Set<String> hs = new HashSet<>();
//	static void pmtn(String s, int l, int r) {
//		if(l == r) { hs.add(s);return;}
//		for(int i = l; i <= r; i++) {
//			s = interChange(s, l, i);
//			pmtn(s, l+1, r);
//			s = interChange(s, l, i);
//		}
//	}
//	static String interChange(String s, int a, int b) {
//		char arr[] = s.toCharArray();
//		char temp = arr[a];
//		arr[a] = arr[b];
//		arr[b] = temp;
//		return String.valueOf(arr);
//	}
	
	//	GAME THEORY
//	static int coinMax(int a[], int l, int r) {
//		if(l + 1 == r) {
//			return Math.max(a[l], a[r]);
//		}
//		return Math.max(a[l] + Math.min(coinMax(a, l+2, r), coinMax(a, l+1, r-1)), 
//				a[r] + Math.min(coinMax(a, l+1, r-1), coinMax(a, l, r-2)));
//	}
	
	
	
	
	public static void main(String[] args) {

		// RECURSION

		/**
		 * LET'S THINK RECURSIVELY 1. BASE CASE- Think of the simplest possible input
		 * for this function. 2. FIND THE RELATION - Think how the larger problem can be
		 * solved with the help of the solution of the smaller problem. 3. GENERALISE -
		 * Make a generalised function that solves the problem. Put this all together
		 * into a Mathematical function or a Tree.
		 * 
		 **/

		// FIND SUM OF FIRST N NATURAL NUMBERS USING RECURSION.
//		System.out.println(sum(5));

		// CALCULATE POWER USING RECURSION a ^ b. + FAST POWER
//		System.out.println(fastpow(3, 10000) + "steps in fastpow: " + stepcount);stepcount = 0;
//		System.out.println(power(10000, 3) + "steps in power: " + stepcount);
		
		// FIND ALL THE PATHS IN A NXM(N by M) MATRIX
//		System.out.println(path(5,5));
		
		// FLOOD FILL
//		int a[][] = {{1,1,1,1,1,1,1,1},
//					{1,1,1,1,1,0,0,1},
//					{1,0,0,1,1,0,1,1},
//					{1,2,2,2,2,0,1,0},
//					{1,1,1,2,2,0,1,0},
//					{1,1,1,2,2,2,2,0},
//					{1,1,1,1,1,2,1,1},
//					{1,1,1,1,1,2,2,1}};
//		floodFill(a, 4, 3, 3, 2);
//		printMat(a);System.out.println();
//		floodFill(a, 0, 0, 3, 1);
//		printMat(a);
		
		// PERMUTATION OF A STRING
//		pmtn("abcc", 0, "abcc".length()-1);
//		hs.forEach(System.out::println);
//		System.out.println(hs);
		
		//	GAME THEORY
//		int a[] = {1, 5, 700, 2, 6, 5};
//		System.out.println(coinMax(a, 0, a.length -1));
		}
}
