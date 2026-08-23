/* Question 17: Write a program to print the following pattern:  */ 

	public class Que17 {
             public static void main(String[] args) {
                 int n = 5;
                 for (int i = 1; i <= n; i++) {
                 String line = "";
                 int num = 1;
                 for (int j = 1; j <= i; j++) {
                 line = line + num;
                 if (j != i) {
                    line = line + "*";
                }
                num = num + 2;
            }
            System.out.println(line);


     }
  }
}