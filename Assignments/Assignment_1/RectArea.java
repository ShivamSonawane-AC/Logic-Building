/* Write a Java program that calculates the area of a rectangle using the formula 
area = length * width. Use predefined values for length and width. */

  import java.util.Scanner ;
  public class RectArea { 
	public static void main (String [] args) { 
  
	System.out.println("Enter Length : "); 
	
	Scanner sc = new Scanner(System.in);
	
	int length = sc.nextInt();
	
	int width = sc.nextInt();
	
	
	int area = length * width;
	
	System.out.print("Area of Rect is : " + area );


  }
}