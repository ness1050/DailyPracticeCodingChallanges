package Problems.Patterns;

import java.util.Scanner;

public class numberP {
    

    public static void main (String [] args) {

        // we are about print a increasing pattern star or number

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a digit to be drawn: ");
        int action = scan.nextInt();

        for (int i = 0; i <= action; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }

        reversePrinting(action);
        decreasingPattern(action);
        increasingByOne(action);
        System.out.println();
        halfDiamond(action);
    }

    public static void reversePrinting(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void decreasingPattern(int n) {

        for (int i=n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void increasingByOne(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }

    public static void halfDiamond(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        for (int i = n -1 ; i >= 1; i--) {
            for  (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
