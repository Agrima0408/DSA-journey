class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        int maxFreq = 0,ans=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(maxFreq<map.get(nums[i])){
                maxFreq=map.get(nums[i]);
                ans=nums[i];
            }
        }
        return ans;
    }
}