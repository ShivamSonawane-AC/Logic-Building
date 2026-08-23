/* Write a Java program that calculates the average marks of a student and determines the grade based on the 
following criteria: 
Grade A: Average marks ≥ 90 
Grade B: Average marks between 70 and 89 
Grade C: Average marks between 50 and 69 
Grade D: Average marks between 30 and 49 
Fail: Average marks < 30   */


public class Grade {
	public static void main (String [] args ) {
	
	int Maths = 90, Science = 75, History = 60;

	int Average ;
	Average = (Maths + Science + History )/ 3 ;
	
	if (Average >= 90 ) {
	System.out.println("Grade A");
	} else if (Average >= 70 && Average<= 89) {
	System.out.println("Grade B");
	} else if (Average>= 50 && Average <=69)  {
	System.out.println("Grade C");
	} else if (Average >= 30 && Average <= 49) {
	System.out.println("Grade D");
	} else {
	System.out.println("FAIL");
	}
	
  } 
}