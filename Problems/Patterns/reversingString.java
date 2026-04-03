package Problems.Patterns;

public class reversingString {


    public static void main(String[] args) {
        reversingString r = new reversingString();
        r.revers("naseem");
    }

    public String revers(String str) {

        String newA = "";

       
        for (int i = str.length() - 1; i >= 0; i--) {
            char a = str.charAt(i);
            newA += a;
        }
        System.out.println(newA);
        return newA;

    }
}

