/* Question 2: Print Multiples of 3 between 1 and N
Problem Statement:
Write a Java program that asks the user for a number N and prints all the multiples of 3 between 1 and N
using a for loop. */


	import java.util.Scanner;

	public class Que2 {
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		for (int i = 3; i <= n; i = i + 3) {
		System.out.print(i + " ");
	}
	}

}