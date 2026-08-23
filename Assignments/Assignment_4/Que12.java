/* Question 12: Sort an Array in Ascending Order
Problem Statement:
Write a Java program that asks the user to input 5 integers, stores them in an array, and then sorts the
array in ascending order using the Arrays.sort() method. After sorting, print the sorted array. */


	import java.util.Scanner;
	import java.util.Arrays;

	public class Que12 {
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		System.out.println("Enter 5 integers");

		for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}

		Arrays.sort(a);
 
		System.out.println("The array in ascending order is");

		for (int x : a) {
		System.out.println(x);
	}
	}

}
