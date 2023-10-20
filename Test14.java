import java.util.Scanner;

public class Test14 {
    //14. Write a Java program to display. Expected Output
//25 != 39
//25 < 39
//25 <= 39
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number1: ");
        int n1 = in.nextInt();
        System.out.print("Input the number2: ");
        int n2 = in.nextInt();

        if (n1 < n2) {
            System.out.println(n1 + " < " + n2);
        }
        else{
            System.out.println(n2 + " < " + n1);
        }

        }
    }
