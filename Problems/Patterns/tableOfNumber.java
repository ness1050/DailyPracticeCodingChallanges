package Problems.Patterns;

import java.util.Scanner;

public class tableOfNumber {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number for table up to 10 or under: ");
        int n = scan.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println( n + " X " + i + " = " + (n * i));
        }
    }
}
