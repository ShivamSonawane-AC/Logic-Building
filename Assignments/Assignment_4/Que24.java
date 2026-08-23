/* Question 24: Reverse a String 
Problem Statement: 
Write a Java program that asks the user for a string and then prints the reverse of that 
string. */

	import java.util.Scanner;
	  public class Que24 {
    		public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);
        		System.out.print("Enter a string: ");
        		String str = sc.nextLine();
        		String rev = "";
        		for (int i = str.length() - 1; i >= 0; i--) {
         	        rev = rev + str.charAt(i);
        }

	        System.out.println("Reversed string: " + rev);
    }

}