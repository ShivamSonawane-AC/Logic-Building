/* Problem 4: Identify the Values of Uninitialized Variables 
Scenario: 
You are working on a program that handles different data types. Your manager has asked you to quickly 
check the values of various variables, but you’re in a rush and forget to initialize them. As you go through 
the code, you expect some values to show up, but Java has something else in mind. Your task is to fix the 
issue and ensure the variables hold proper values. */ 


   public class UniVar {
	public static void main (String[] args) {
	
	byte a = 5; 
	short b = 10; 
	int c = 50; 
	long d = 10000L; 
	float e = 100.5f; 
	double f = 10.00022; 
	char g = 'a' ; 
	boolean h = true;

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);

	
	}
} 