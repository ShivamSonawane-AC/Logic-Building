/* Question 16: Write a program to print the following pattern:  */


public class Que16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String line = "";
            for (int j = 1; j <= i; j++) {
                line = line + j;
                if (j != i) {
                    line = line + "*";
                }
            }
            System.out.println(line);
        }
    }
}