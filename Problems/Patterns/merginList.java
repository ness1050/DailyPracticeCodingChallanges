package Problems.Patterns;

import java.util.Arrays;

public class merginList {
    

    public static void main(String[] args) {

        int [] l1 = {1,23,5,6,7};
        int [] l2 = {2,24,8,9};
        
        merginList l = new merginList();
        
        System.out.println(Arrays.toString(l.mergin(l1, l2)));
        
        
    }

    public int [] mergin (int [] l1, int l2 []) {
        if (l1 == null || l2 == null) {
            return null;
        }

        int [] result = new int[l1.length + l2.length];

        for (int i=0; i < l1.length; i++) {
            result[i] = l1[i];
        }

        for (int j = 0; j < l2.length; j++) {
            result[l1.length + j] = l2[j];
        }

        return result;
    }

    

}
