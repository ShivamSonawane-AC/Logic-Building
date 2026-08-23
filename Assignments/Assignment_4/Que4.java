/* Question 4: Print Even Numbers from 1 to N
Problem Statement:
Write a Java program that asks the user for a number N and prints all the even numbers from 1 to N using
a for loop. */


	import java.util.Scanner;

	  public class Que4 {
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		for (int i = 2; i <= n; i = i + 2) {
		System.out.print(i + " ");
	}
	}

}