/* Question 27: String Literal and Object Creation 
Problem Statement: 
Write a Java program that creates two string variables using string literals with the same 
content. Then, print whether both variables point to the same object. */


	public class Que27 {
   		 public static void main(String[] args) {
      
	  String str1 = "hello";
          String str2 = "hello";
          System.out.println("Both variables point to the same object: " + (str1 == str2));
    }
}