package Problems.Patterns;

public class palidrom {

    public static void main(String[] args) {
        System.out.println(palidromT("level"));
        palidrom p = new palidrom();
        System.out.println(p.isPalidrome("HelleH")
);
    }
    
    public static boolean palidromT(String str) {
        
        String s = str.toLowerCase();
        String newR = "";

        for (int i= str.length() - 1; i >= 0; i--) {
            
            newR = newR + s.charAt(i);;
        }

        return s.equals(newR);
    }

    public boolean isPalidrome(String s) {
       

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
