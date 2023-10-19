import java.util.Scanner;

public class Test8 {
    //8. Write a Java program to divide two numbers and print on the screen.
    //Test Data: 50/3
    //Expected Output: 16
    public static void main(String[] args) {

       // int n1 = 50;
       // int n2 = 3;
       // int area = n1 / n2;
       // System.out.println("Expected Output: " + area);
            Scanner in = new Scanner(System.in);
            System.out.print("Input first number: ");
            int n1 = in.nextInt();
            System.out.print("Input second number: ");
            int n2 = in.nextInt();
            System.out.println(n1 + " / " + n2 + " = " + n1 / n2);
        }

}