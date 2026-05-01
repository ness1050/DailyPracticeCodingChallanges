package src;
import java.util.*;

public class main {
    
    

    public static void main(String [] args) {
   
        calculator c = new calculator();
        Scanner scan = new Scanner(System.in);
    
        System.out.println("1.Addition " + "\n" + "2.Subtraction " + "\n" + "3.Multiplication " + "\n" + "4.Division" + "\n" + "Enter choice: ");
        int choice = scan.nextInt();
        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

      

        switch (choice) {
            case 1:
                c.addition(num1, num2);
                scan.close();
                break;
            case 2: 
                c.Subtraction(num1, num2);
                scan.close();
                break;
            case 3:
                c.Multiplication(num1, num2);
                scan.close();
                break;
            case 4:
                c.division(num1, num2);
                scan.close();
                return;
            default:
                return;
               
        }
    };

    


    

}
