package Problems.Patterns;

public class swap {
    

    public static void main (String [] args) {

        int a = 10;
        int b = 5;

        System.out.println(
        swaping(a, b));
        
    }

    public static String swaping(int a, int b) {
        
        a = a + b;
        b = a - b;
        a = a - b;
        return "A = " +  a  + " B = " + b;
    }
}
