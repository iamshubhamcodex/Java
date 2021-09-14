package m;

import java.util.Scanner;

public class Ut {

	public static void main(String[] args) {
	}

	public static int divisor_sum(int n) {
		int sum = n;
		for (int i = 1; i <= (n / 2); i++) {
			if ((n % i) == 0)
				sum += i;
		}
		return sum;
	}
	
	public static boolean isPrime(int i) {
		boolean isP = true;
		for(int a = 2; a*a < i; a++) {
			if(i % a == 0) { 
				isP = false;
				System.out.println(a);
				break;
			}
		}
		return isP;
	}

	public static int maxInArr(int[] arr) {
		int temp = 0;
		for (int i = 0; i < (arr.length); i++) {
			if (!(temp > arr[i]))
				temp = arr[i];
		}
		return temp;
	}

	public static int maxOf(int a, int b) {
		return a > b ? a : b;
	}

	public static double avgMarks(int[] mark) {
		double sum = 0;
		for (int i : mark) {
			sum += i;
		}
		return sum / mark.length;
	}

	public static char[] list(String s) {
		return s.toCharArray();
	}

	public static Scanner sc() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

	public static int revint(int a) {
		int temp = a / 10, rea = a % 10;
		while (temp > 0) {
			rea = (rea * 10) + temp % 10;
			temp = temp / 10;
		}
		return rea;
	}

	public static String revStrC(String s, int a) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += (a == 1) ? (s.charAt(i) == ' ' && s.charAt(i - 1) == ' ') ? "" : s.charAt(i) : s.charAt(i);
		}
		return s1;
	}

	public static String revStrW(String s, int j) {
		String s1 = "";
		String h[] = (j == 1) ? s.split("[ ]+") : s.split(" ");
		for (int i = h.length - 1; i >= 0; i--) {
			s1 += (i == 0) ? h[i] : h[i] + " ";
		}
		return s1;
	}

	public static int inputint() {
		System.out.println("Enter a Number");
		int b = sc().nextInt();
		return b;
	}

	public static int inputint(String s) {
		System.out.println(s);
		int b = sc().nextInt();
		return b;
	}

	public static String inpute() {
		String b = sc().nextLine();
		return b;
	}

	public static String inputStr(String s) {
		System.out.println(s);
		String b = sc().nextLine();
		return b;
	}

	public static char inputchar(String s) {
		System.out.println(s);
		char b = sc().nextLine().charAt(0);
		return b;
	}

	public static short inputshort(String s) {
		System.out.println(s);
		short b = sc().nextShort();
		return b;
	}

	public static double inputdoub(String s) {
		System.out.println(s);
		double b = sc().nextDouble();
		return b;
	}

	public static float inputfloat(String s) {
		System.out.println(s);
		float b = sc().nextFloat();
		return b;
	}

	public static long inputlong(String s) {
		System.out.println(s);
		long b = sc().nextLong();
		return b;

//		if (((regex.length() == 1 && ".$|()[{^?*+\\".indexOf(ch = regex.charAt(0)) == -1)
//				|| (regex.length() == 2 && regex.charAt(0) == '\\' && (((ch = regex.charAt(1)) - '0') | ('9' - ch)) < 0
//						&& ((ch - 'a') | ('z' - ch)) < 0 && ((ch - 'A') | ('Z' - ch)) < 0))
//				&& (ch < Character.MIN_HIGH_SURROGATE || ch > Character.MAX_LOW_SURROGATE)) {
//		}
	}
}
