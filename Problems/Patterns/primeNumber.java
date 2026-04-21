package Problems.Patterns;

import java.util.Scanner;

public class primeNumber {
    
    public static void main(String[] args) {
        primeNumber p = new primeNumber();
        isPrime(10);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int  a = scan.nextInt();
        printNumbers(a);

    }

    public static boolean isPrime(int a) {


        boolean result = a % 2 == 0 ?  true : false;
        System.out.println(result);
        return result;
    }

    // we want to create a funciton
    // that exacutes the function to find the numbers in between the given integer to check
    // which numbers can prime 

    public static boolean numbersOfPrime(int a ) {

        if (a <= 1) {
            return false;
        }

        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
              return false;
            }
           
        };

        return true;
    }

    public static void printNumbers(int a) {
        for (int i = 1; i <= a; i++) {
            if (numbersOfPrime(i)) {
                System.out.println(i);
            }
        }
    }

  
}
