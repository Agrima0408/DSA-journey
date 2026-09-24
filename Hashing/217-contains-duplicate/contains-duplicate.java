class Solution {
    public boolean containsDuplicate(int[] nums) {
    //     int[] count = new int[10];
    //     for(int i=0;i<nums.length;i++){
    //         int dig = nums[i];
    //         count[dig]++;
    //     }
    //     for(int i=0;i<10;i++){
    //         if(count[i]>1) return true;
    //     }
    //     return false;
       HashSet<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])) return true;
        else{
            set.add(nums[i]);
        }
       }
       return false;
    }
}