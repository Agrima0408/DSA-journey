import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] twoSum2(int[] nums, int target) {
      
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int req= target - nums[i];
            
            if (set.contains(req)) {
               
                for (int j = 0; j < nums.length; j++) {
                   
                    if (nums[j] == req && j != i) {
                        return new int[] { i, j };
                    }
                }
            }
        }
        
        return new int[] {};
    }
}
