package Problems.Patterns;

import java.util.HashSet;
import java.util.Set;

public class Dubble {
    

    public static void main(String[] args) {

        int [] l = {1,2,1,3,2,4,5,6};
        dubbles(l);
    }

    public static void dubbles(int[] l) {

     Set <Integer> set = new HashSet<>();

     for (int i = 0; i < l.length; i++) {
        if (set.contains(l[i])) {
            System.out.println("Duplicate found: " + l[i]);
        } else {
            set.add(l[i]);
            
        }
     }
     
    }
}
