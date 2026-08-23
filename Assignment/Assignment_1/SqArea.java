/* Write a Java program that calculates the area of a square using the formula 
area = side * side. Use a predefined side length. */ 

  import java.util.Scanner; 
  public class SqArea {
  	public static void main (String [] args) {

	System.out.println("Enter Side : "); 
	
	Scanner sc = new Scanner(System.in);
	
	int side = sc.nextInt();
	
	int area = side * side;
	
	System.out.print("Area of square is : " + area );
		

  }
}	