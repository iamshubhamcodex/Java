package m;

import java.util.Scanner;

public class Ut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password");
		String pass = sc.nextLine();
		hashPass(pass);
		sc.close();
//		System.out.println(haspas);
	}
	public static int maxOf(int a, int b) {
		return a > b ? a:b;
	}
	public static double avgMarks(int[] mark) {
		double sum = 0;
		for(int i:mark) {
			sum+=i;
		}
		return sum/mark.length;
	}
	public static char[] list(String s) {
		return s.toCharArray();
	}
	
	public static Scanner sc() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}

	public static int revint(int a) {
		int temp = a/10;
		int rea = a%10;
		int cn = 0;
		
		while(temp>0) {
			cn = temp%10;
			rea = (rea*10) + cn;
			temp = temp/10;
		}
		return rea;
	}
	public static String revStr(String s) {
		String s1 = "";
		for(int i = s.length()-1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		return s1;
	}
	public static String revStrW(String s) {
		String s1 = "";
		String h[] = s.split("[ ]+");
		for(int i = h.length-1; i >= 0; i--) {
			if(i == 0) {s1 += h[i];} else s1 += h[i] + " ";
		}
		return s1;
	}

	public static String revStrWp(String s) {
		String s1 = "";
		String h[] = s.split("[ ]+");
		for(int i = h.length-1; i >= 0; i--) {
			if(i == 0) {s1 += h[i];} else s1 += h[i] + " ";
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
	}
	public static void hashPass(String s) {
		char[] pasarr = s.toCharArray(); 
		char[] haspas = new char[s.length()];
		int i = 0;
		long start = System.currentTimeMillis();
		while(i++ < s.length()-1) {
			switch (pasarr[i]) {
				case  'a':haspas[i] = '!'; break;
				case  'b':haspas[i] = '#'; break;
				case  'c':haspas[i] = '$'; break;
				case  'd':haspas[i] = '%'; break;
				case  'e':haspas[i] = '^'; break;
				case  'f':haspas[i] = '&'; break;
				case  'g':haspas[i] = '*'; break;
				case  'h':haspas[i] = '('; break;
				case  'i':haspas[i] = ')'; break;
				case  'j':haspas[i] = '='; break;
				case  'k':haspas[i] = '+'; break;
				case  'l':haspas[i] = 'q'; break;
				case  'm':haspas[i] = 'w'; break;
				case  'n':haspas[i] = 'e'; break;
				case  'o':haspas[i] = 'r'; break;
				case  'p':haspas[i] = 't'; break;
				case  'q':haspas[i] = 'y'; break;
				case  'r':haspas[i] = 'u'; break;
				case  's':haspas[i] = 'i'; break;
				case  't':haspas[i] = 'o'; break;
				case  'u':haspas[i] = 'p'; break;
				case  'v':haspas[i] = '['; break;
				case  'w':haspas[i] = ']'; break;
				case  'x':haspas[i] = '|'; break;
				case  'y':haspas[i] = '{'; break;
				case  'z':haspas[i] = '}'; break;
				case  'A':haspas[i] = 'a'; break;
				case  'B':haspas[i] = 's'; break;
				case  'C':haspas[i] = 'd'; break;
				case  'D':haspas[i] = 'f'; break;
				case  'E':haspas[i] = 'g'; break;
				case  'F':haspas[i] = 'h'; break;
				case  'G':haspas[i] = 'j'; break;
				case  'H':haspas[i] = 'k'; break;
				case  'I':haspas[i] = 'l'; break;
				case  'J':haspas[i] = ';'; break;
				case  'K':haspas[i] = ':'; break;
				case  'L':haspas[i] = 'z'; break;
				case  'M':haspas[i] = 'x'; break;
				case  'N':haspas[i] = 'c'; break;
				case  'O':haspas[i] = 'v'; break;
				case  'P':haspas[i] = 'b'; break;
				case  'Q':haspas[i] = 'n'; break;
				case  'R':haspas[i] = 'm'; break;
				case  'S':haspas[i] = ','; break;
				case  'T':haspas[i] = '<'; break;
				case  'U':haspas[i] = '>'; break;
				case  'V':haspas[i] = '/'; break;
				case  'W':haspas[i] = '?'; break;
				case  'X':haspas[i] = '1'; break;
				case  'Y':haspas[i] = '2'; break;
				case  'Z':haspas[i] = '3'; break;
				case  '!':haspas[i] = '4'; break;
				case  '#':haspas[i] = '5'; break;
				case  '$':haspas[i] = '6'; break;
				case  '%':haspas[i] = '7'; break;
				case  '^':haspas[i] = '8'; break;
				case  '&':haspas[i] = '9'; break;
				case  '*':haspas[i] = '0'; break;
				case  '(':haspas[i] = 'Q'; break;
				case  ')':haspas[i] = 'W'; break;
				case  '=':haspas[i] = 'E'; break;
				case  '+':haspas[i] = 'R'; break;
				case  '1':haspas[i] = 'T'; break;
				case  '2':haspas[i] = 'Y'; break;
				case  '3':haspas[i] = '`'; break;
				case  '4':haspas[i] = 'I'; break;
				case  '5':haspas[i] = 'O'; break;
				case  '6':haspas[i] = 'P'; break;
				case  '7':haspas[i] = 'A'; break;
				case  '8':haspas[i] = '`'; break;
				case  '9':haspas[i] = 'D'; break;
				case  '0':haspas[i] = 'F'; break;
				case  '/':haspas[i] = 'G'; break;
				case  ',':haspas[i] = 'H'; break;
				case  '?':haspas[i] = 'J'; break;
				case  '<':haspas[i] = 'K'; break;
				case  '>':haspas[i] = 'L'; break;
				case  '{':haspas[i] = 'Z'; break;
				case  '}':haspas[i] = 'C'; break;
				case  '[':haspas[i] = 'X'; break;
				case  ']':haspas[i] = 'V'; break;
				case  '|':haspas[i] = 'B'; break;
				case  ';':haspas[i] = 'N'; break;
				case  ':':haspas[i] = 'M'; break;
				case  '`':haspas[i] = 'S'; break;
				case  '~':haspas[i] = 'U'; break;
			}				
		}

		long end = System.currentTimeMillis();
		for(char k: haspas) {
			System.out.print(k);
		}
		System.out.print("\t\t Total Time Taken is: " + (end-start));
	}
}