import java.util.Scanner;

public class Test14 {
//14. Write a Java program to display. Expected Output
//25 != 39
//25 < 39
//25 <= 39
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n1 = in.nextInt();
        System.out.print("Input second number: ");
        int n2 = in.nextInt();

        if (int n1 < n2) {
            System.out.println(n1 + " < " + n2);


        }
        }
    }

 for (int n2 = 0; n2 < 11; n2++) {
        System.out.println(n1 + " * " + n2 + " = " + n1 * n2);
        if (n2 == 11) {
        break;
        }