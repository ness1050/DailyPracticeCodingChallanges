package Problems.Patterns;

public class primeNumber {
    
    public static void main(String[] args) {
        isPrime(15);
    }

    public static int isPrime(int a) {

        if ( a % 2  == 0) {
            System.out.println("isPrime number" + a);
        } else {
            System.out.println("Not a prime number: " + a);
        }

        return a;
    }
}
