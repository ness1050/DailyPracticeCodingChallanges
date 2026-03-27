package Problems.Patterns;

public class duplicate {
       
    
    public static void main(String [] args) {
        int [] list = {1,1,2,3,4,6,2,3,7,6,8};
        duplicate d = new duplicate();
       System.out.println( d.RemoveDuplicate(list));
    }

    /**
     * Removing duplicate from integer lists
     * @param nums list numbers
     * @return return the remaining without 
     */
    public int RemoveDuplicate(int [] nums) {

        if (nums.length == 0) return 0;
        int []result = nums;
        System.out.println( result);

        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums [slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }
}
