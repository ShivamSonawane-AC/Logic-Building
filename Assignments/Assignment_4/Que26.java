/* Question 26: Check if a String is a Palindrome 
Problem Statement: 
Write a Java program that asks the user for a string and checks whether the string is a 
palindrome. A palindrome is a string that reads the same backward as forward (ignoring 
spaces and punctuation). */


	import java.util.Scanner;
    		public class Que26 {
  		  public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string: ");
         String str = sc.nextLine();
         String clean = str.toLowerCase().replace(" ", "");
         String rev = "";
         for (int i = clean.length() - 1; i >= 0; i--) {
            rev = rev + clean.charAt(i);
        }
        if (clean.equals(rev)) {
            System.out.println("The string '" + str + "' is a palindrome.");
        } else {
        	    System.out.println("The string '" + str + "' is not a palindrome.");
        }


    }
}