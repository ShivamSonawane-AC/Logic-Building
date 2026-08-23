// Write a Java program that checks if a predefined number is odd or even. Use an if-else statement and the modulus operator (%) to determine whether the number is divisible by 2 or not


public class EvenOrOdd {
   public static void main(String [] args) {
	
	int num = 10 ; 
	
	if(num % 2 == 0 ) {
	     System.out.println("Even");
	}
	
	else {
		System.out.println("Odd");
	}
    }
}