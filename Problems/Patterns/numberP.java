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
            System.out.print();
        }
    }

}
