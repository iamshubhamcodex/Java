package javaTut;

//import java.util.Scanner;

//import m.Ut;

public class __9Arrays {

	public static void main(String[] args) {
		
		// ARRAYS
	   /**	Arrays is a data structure that is used to store multiple values in a single variable, instead of declaring separate variables
	    * 	 for each value. It is continuous means every space in memory is alloted one after one.  
		 *		ex:-	Arrays of Cars => "Suzuki", "Ferrai", "Audi", "BMW", "Ford"
		 *
		 *	SYNTAX =>	DataType[] arrayName;
		 *				arrayName = new DataDype[n];	//	n shows how many values we want to store
		 *
		 *	OR 	=>		DataType[] variableName = new DataType[n];	//	we also can not increase the size of array when declared;
		 *	OR	=>		DataType arrayName[] = new DataType[n];	//	in above method we can create as many arrays by just typing []
		 *														//	once, but in this case we have to type [] again and again after arrayName 
		 *
		 *		//	By default when we create Array of n size, we get 0 as Integer, 0.0 as Double or Float,   as Char, "false" as Boolean,
		 *			"null" as String at all place. We can update later;
		 **/
		
//		Scanner sc = new Scanner(System.in);
		
//		boolean[] cars = new boolean[5];
//		System.out.println(cars[0]);
//		int[] age = {12,25,48,56};
//		double[] marks = {1.0, 2.0, 5.6, 4.8};
		
//		System.out.println(age[0] + " " + marks[3]);
//		marks[3] = 5.9;
//		System.out.println(marks[3]);
		
//		for(int i = 0; i < age.length; i++) {
//			System.out.print(age[i] + " ");
//		}
//		System.out.println();
//		for(int j : age) {
//			System.out.print(j + " ");
//		}
		
		//	CODE TO STORE ALL STUDENT'S MARKS AND THEN CALCULATE AVERAGE OF MARKS
		
//		System.out.println("Enter Number of Students");
//		int n = sc.nextInt();
//		double[] marks = new double[n];
//		
//		for(int j = 0; j < marks.length; j++) {
//			System.out.println("Enter marks of Student " + (j+1));
//			int g = sc.nextInt();
//			marks[j] = g;
//		}
//		double sum = 0.0;
//		for(int k = 0; k < marks.length; k++) {
//			sum+= marks[k];
//		}
//		System.out.println("Average Number of Your Class is: " + sum/n + " marks");
//		
		
		
		//	MULTIDIMENSIONAL ARRAY
		/**
		 *	If we put an array inside an array then this is called multidimensional array
		 *
		 *	like 2d 3d etc	//	2D ARRAY IS LIKE MATRICES SO WE CAN DO OPERATION ON THEM LIKE MATRIX
		 * 
		 **/
		//	LIST OF ALL STUDENTS WITH MARKS OF EACH SEMESTER
		//	k == students	i == subject and j == marks of two semester
//		System.out.println("Enter Number of Students ");
//		int n = sc.nextInt();
//		sc.nextLine();
//		String[] stdName = new String[n];
//		for(int q = 0; q < n; q++) {
//			System.out.println("Enter Name of Student " + (q+1));
//			String name = sc.nextLine();
//			stdName[q] = name;
//		}
//		int[][] studentMarks = new int[5][3];
//		for(int k = 1; k <= n; k++) {
//			System.out.println("\nEnter Details of Student " + k + "(" + stdName[k-1] + ")" );
//			for(int i = 0; i < 5; i++) {
//				System.out.println("Enter Subject Code");
//				int sub = sc.nextInt();
//				studentMarks[i][0] = sub;
//				for(int j = 1; j <= 2; j++) {
//					System.out.println("Enter Marks of " + stdName[k-1] + "(" + sub + ")");
//					int marks = sc.nextInt();
//					studentMarks[i][j] = marks;
//				}
//			}
//		}
//		
//		for(int y = 1; y <= n; y++) {
//			System.out.println("\nStudent " + y);
//			System.out.println("Subject Code:\t Marks of Each Semester");
//			for(int u = 0; u < 5; u++) {
//				System.out.print(studentMarks[u][0] + " \t\t" );
//				for(int t = 1; t <= 2; t++) {
//					System.out.print(studentMarks[u][t] + " ");
//				}System.out.println();
//			}
//		}
		
		
//		sc.close();
	}

}
