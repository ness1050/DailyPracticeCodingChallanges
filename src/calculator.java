package src;

public class calculator {
    

    public int num1, num2;
    public int sum;

    public void addition(int num1, int num2) {
      if (num1 <= 0 || num2 <= 0) {
        System.out.println("Please provide a number greater then 0");
        return;
      }

      int sum = num1 + num2;
      this.sum = sum;
      System.out.println(sum);
    }

    public int Subtraction(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0 ) {
          System.out.println("You have enterd a number lower then zero!");
          return 0;
        }
        int result = num1 -num2;
        System.out.println(result);
        return result;
       
    }

    public long division(int num1, int num2) {
      if (num1 <= 0 || num2 <= 0 ) {
          System.out.println("You have enterd a number not devisable!");
          return 0;
        }
      long result = num1 /num2;
      System.out.println(result);
      return num1 / num2;
    }

    public long Multiplication(int num1, int num2) {
      if (num1 <= 0 || num2 <= 0 ) {
          System.out.println("You have enterd a number lower then zero!");
          return 0;
        }
        long result = num1 *num2;
        System.out.println(result);
        return num1 * num2;
    }


 

}
