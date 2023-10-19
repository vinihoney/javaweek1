import java.util.Scanner;

public class Test11 {
    //Write a Java program that takes a number as input and prints its multiplication table upto 10.
    //Expected Output :
    //8 x 1 = 8
    //...
    //8 x 10 = 80
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n1 = in.nextInt();

        for (int n2 = 0; n2 < 11; n2++) {
            System.out.println(n1 + " * " + n2 + " = " + n1 * n2);
            if (n2 == 11) {
                break;
            }
        }
    }
}
