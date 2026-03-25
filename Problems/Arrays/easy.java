package Problems.Arrays;
import java.util.*;


public class easy {
    
    public static void main(String[] args) {
        
        //lets create an intance of class
        easy e  = new easy();
        
        // First task given an Array or list and a target 
        // where to find the two sum of integer to add up to the target
        int [] nums = {1,3,5,7,9};
        int target = 12;
        int[] result =  e.pairTarget(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] pairTarget(int[] num, int target) {
        // There are multiple ways to solve this question but we choice the Hashmap
        // since it is very fast approch to a pair value to meet the target

        HashMap <Integer, Integer> map = new HashMap<>();
        
    // we need to loop through the list to find the possible solution
        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i]; // if there is complement then its not a match
            if (map.containsKey(complement)) {
                return new int[]{complement, num[i]};

            }
            map.put(num[i],i );
            
        };

        return new int[] {-1, -1};
    }
}
