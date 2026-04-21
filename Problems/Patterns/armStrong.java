package Problems.Patterns;

import java.util.Scanner;

public class armStrong {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one digit to check the armstrong ? : ");
        int a = scan.nextInt();
        number(a);
    }
    

    public static int number(int a) {
        int n = a;
        int sum = 0;

        while (n != 0) {
            int d = n % 10; 
            sum += d * d * d;
            n /= 10;
        }
        System.out.println(sum == a ? "ArmStrong" : "not ArmStrong");

        return sum;
    }
}
