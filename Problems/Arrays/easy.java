package Problems.Arrays;
import java.util.*;


public class easy {
    
    public static void main(String[] args) {
        
        //lets create an intance of class
        easy e  = new easy();
        
        // First task given an Array or list and a target 
        // where to find the two sum of integer to add up to the target
        int [] nums = {1,6,5,7,9, 14};
        int target = 12;
        int[] result =  e.pairTarget(nums, target);
        System.out.println(Arrays.toString(result));
        System.out.println("max vinst: " + e.MaxValue(nums));
    }

    /* Finding the target by keypair value */
    /**
     * Time complexity is O(n)
     * @param num number lists
     * @param target target integer 
     * @return the key pair value match to the target
     */
    public int[] pairTarget(int[] num, int target) {
        // There are multiple ways to solve this question but we choice the Hashmap
        // since it is very fast approch to a pair value to meet the target

        HashMap <Integer, Integer> map = new HashMap<>();
        
    // we need to loop through the list to find the possible solution
        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i]; // if there is complement in the last that is the match 
            if (map.containsKey(complement)) {
                return new int[]{complement, num[i]};

            }
            map.put(num[i],i );
            
        };
        return new int[] {-1, -1};
    }

    /**
     * Finding the stock prices and finding out the profit 
     * @param prices stock prices
     * @return the difference proft betweeen price if there is profit 
     */
    public int MaxValue(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // lets iterate through the list of integer to compare the prices
        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else {
                int profit = price - minprice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }




}
