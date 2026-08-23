/* Question 13: Check if an Array Contains a Specific Element
Problem Statement:
Write a Java program that asks the user to input 5 integers, stores them in an array, and then checks
whether a specific number (input by the user) is present in the array using the Arrays.asList() method. If
the number is found, print "Found", otherwise print "Not Found". */


	import java.util.Scanner;
	import java.util.Arrays;

	public class Que13 {
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		Integer a[] = new Integer[5];

		System.out.println("Enter 5 integers");

		for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}

		System.out.println("Enter the number to search");
		int n = sc.nextInt();

		if (Arrays.asList(a).contains(n)) {
		System.out.println("Found");
	}
		else {
		System.out.println("Not Found");
	}
	}

}
