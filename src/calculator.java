package src;

public class calculator {
    

    public int num1, num2;
    public int sum;

    public calculator() {

    }

    public void addition(int num1, int num2) {
      if (num1 <= 0 || num2 <= 0) {
        System.out.println("Please provide a number greater then 0");
        return;
      }

      int sum = num1 + num2;
      this.sum = sum;
      System.out.println(sum);
    }


}
