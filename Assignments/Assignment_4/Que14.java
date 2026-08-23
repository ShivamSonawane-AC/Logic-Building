/* Question 14: Find the Index of an Element in an Array
Problem Statement:
Write a Java program that asks the user to input 5 integers, stores them in an array, and then finds the
index of a specific number (input by the user) using the Arrays.binarySearch() method. If the number is
found, print the index, otherwise print "Not Found". */


	import java.util.Scanner;
	import java.util.Arrays;

	public class Que14 {
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[5];

		System.out.println("Enter 5 integers");

		for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}

		Arrays.sort(a);

		System.out.println("Enter the number to search");
		int n = sc.nextInt();

		int index = Arrays.binarySearch(a, n);

		if (index >= 0) {
		System.out.println("The number " + n + " is found at index " + index);
	} 
		else {
		System.out.println("Not Found");
	}
	}

}
