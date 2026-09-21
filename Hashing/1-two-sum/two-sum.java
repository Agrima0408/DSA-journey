class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int req=0;
        for(int i=0;i<nums.length;i++){
            req = target - nums[i];
                if(map.containsKey(req)){
                    return new int[] {map.get(req),i};
                }
                map.put(nums[i],i);
            
        }
        return new int[] {};
    }
}