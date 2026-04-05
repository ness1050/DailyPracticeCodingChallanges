package Problems.Patterns;

public class primeNumber {
    
    public static void main(String[] args) {
        isPrime(15);
    }

    public static boolean isPrime(int a) {

       
        boolean result = a % 2 == 0 ?  true : false;
        System.out.println(result);
        return result;
    }
}
