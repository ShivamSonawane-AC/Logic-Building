/* Question 7: Find the Sum of All Elements in an Array Problem Statement: Write a Java program that uses a for-each loop to calculate the sum of all elements in a given integer array. The program should ask the user to input 5 integers, store them in an array, and then compute the sum of these numbers using the for-each loop. */

    import java.util.Scanner;

	public class Que7 {
	    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 integers ");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int x : a) {
            sum = sum + x;
        }
        System.out.println("The sum of all numbers is " + sum);
    }
}