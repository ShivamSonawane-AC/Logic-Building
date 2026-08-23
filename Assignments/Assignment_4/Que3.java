/* Question 3: Calculate the Factorial of a Number
Problem Statement:
Write a Java program that asks the user for a number N and calculates the factorial of N using a for loop. */


	import java.util.Scanner;
	    public class Que3 {
		public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
		  factorial = factorial * i;
	}

		System.out.println("Factorial of " + n + " is " + factorial);
	}

}