import java.util.Scanner;

public class Test10 {
        //Write a Java program that takes two numbers as input and display the
        //product of two numbers.
        //Test Data:
        //Input first number: 25
        //Input second number: 5
        //Expected Output : 25 x 5 = 125
       public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
               System.out.print("Input first number: ");
               int n1 = in.nextInt();
               System.out.print("Input second number: ");
               int n2 = in.nextInt();
               System.out.println(n1 + " x " + n2 + " = " + n1 * n2);
           }
}
