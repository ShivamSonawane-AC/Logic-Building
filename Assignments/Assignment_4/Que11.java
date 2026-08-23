/* Question 11: Count Positive and Negative Numbers in an Array
Problem Statement:
Write a Java program that asks the user to input 6 integers, stores them in an array, and then counts how
many positive and negative numbers are present in the array. */


	import java.util.Scanner;

	public class Que11 {
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[6];

		System.out.println("Enter 6 integers");

		for (int i = 0; i < 6; i++) {
		a[i] = sc.nextInt();
	}

		int positive = 0;
		int negative = 0;

		for (int x : a) {
		if (x > 0) {
			positive++;
		}
		else if (x < 0) {
			negative++;
		}
	}

		System.out.println("Positive numbers " + positive);
		System.out.println("Negative numbers " + negative);
	}

}
