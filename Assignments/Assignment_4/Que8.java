/* Question 8: Print All Names in a String Array
Problem Statement:
Write a Java program that uses a for-each loop to print all the names stored in a String array. The program
should ask the user to input 4 names, store them in an array, and then print each name using the for-each
loop. */


	import java.util.Scanner;

	public class Que8 {
		public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String names[] = new String[4];

		System.out.println("Enter 4 names");

		for (int i = 0; i < 4; i++) {
		names[i] = sc.next();
	}

		System.out.println("The names are");

		for (String name : names) {
		System.out.println(name);
	}
	}

}
