package javaTut;

public class __5Conditionals {

	public static void main(String[] args) {
		//	Conditionals

	   /**
		 * Conditional statements first check condition then execute particular code
		 * 
		 * SYNTAX	[if(condition){//CODE}]
		 * 
		 * 	Inside condition, you can only pass that thing which returns boolean value
		 **/
			
//		int c1 =5;
//		int c2 = 10;
//		if(c1<c2){
//			System.out.println("c2 is greater than c1");
//		}
		/**CHECK ARE YOU ELGIBLE FOR VOTING**/
//		int yourAge = 35;
//		int requAge = 18;
//		if(yourAge > requAge) {
//			System.out.println("You can Vote");
//		}
		

	   /**
		 * There is else statement also which runs when if's condition is false
		 * Syntax =>	if(condition){//CODE1}else{//CODE2}
		 **/
		
		/**CHECK WHETHER HE LOVES ME OR NOT**/
//		int noOfPetals = 62;
//		if(noOfPetals % 2 == 0){
//			System.out.println("He loves me not");
//		}else {
//			System.out.println("He loves me");
//		}
		
		 /**
		 * There is else if statement also which is used to check multiple value for single condition 
		 * Syntax =>	if(condition){//CODE1}else if{//CODE2} else{//CODE3}
		 **/

		//	GRADE SYSTEM
		
//		int number = 40;
//		int totalNumber = 40;

//		if(number>10 && number<totalNumber) {System.out.println("Your grade is \"C\"");}
//		else if(number>20 && number<totalNumber) {System.out.println("Your grade is \"B\"");}
//		else if(number>30 && number<totalNumber) {System.out.println("Your grade is \"A\"");}
//		else if(number>=31 && number<=totalNumber) {System.out.println("Your grade is \"AA\"");}
//		else if(number>totalNumber) {System.out.println("Your Number is WRONG");}
//		else {System.out.println("Your grade is \"E\"");}
		
		
		//SHORTHAND IF......ELSE
		
		/**variable = (condition) ? espressionTrue : expressionFalse;**/
		
//		int g = 5;
//		int c = (g<10) ? 10: 9;	//	this shorthand is used when if else statement return something
//		System.out.println(c);
		
		//NESTED CONDITIONALS
		
		/**
		 * We can use if...else statements inside another if...else and this is called NESTED IF ELSE
		 **/
		
		//	DAILY ROUTINE
		
//		String day = "Monday";
//		int hour = 22;
//		
//		if (day == "Sunday") {
//			System.out.println("I will not follow this routine today");
//		}else {
//			if(hour >= 6 && hour <= 8) {
//				System.out.println("Eat Breakfast");
//			}else if(hour >= 12 && hour <= 14) {
//				System.out.println("Eat Afternoon Food");
//			}else if(hour >= 18 && hour <= 20) {
//				System.out.println("Eat Dinner");
//			}else if((hour >= 21 && hour <= 24)||(hour >= 0 && hour <= 6)) {
//				System.out.println("Sleep");
//			}else {
//				System.out.println("Do Your Work");
//			}
//		}
	}
}
