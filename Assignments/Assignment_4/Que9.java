/* Question 9: Find the Largest Element in an Array
Problem Statement:
Write a Java program that asks the user to input 5 integers, stores them in an array, and then finds and
prints the largest element in the array. (Explore in-built method to solve this) */


	import java.util.Scanner;
	import java.util.Arrays;

	public class Que9 {
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		System.out.println("Enter 5 integers");

		for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}

		Arrays.sort(a);

		System.out.println("The largest element is: " + a[4]);
	}

}
