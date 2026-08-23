/* Write a Java program that takes an integer between 1 and 7 and prints the corresponding day of the week 
using a switch-case statement. If the input is outside the range of 1 to 7, the program should display 
"Invalid day number". */

  import java.util.Scanner;
  public class Day {
	public static void main (String [] args) { 
	
	System.out.println ("Enter No between 1 to 7 : " );
	
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt () ;

	switch (num) {
	
	case 1 : 
		System.out.println("MON") ;
		break;
	case 2 : 
		System.out.println("TUE") ;
		break;
	case 3 : 
		System.out.println("WED") ;
		break;
	case 4 : 
		System.out.println("THUR") ;
		break;
	case 5 : 
		System.out.println("FRI") ;
		break;
	case 6 : 
		System.out.println("SAT") ;
		break;
	case 7 : 
		System.out.println("SUN") ;
		break;
	default : 
		System.out.print("NA") ;
	
	}


	}
} 