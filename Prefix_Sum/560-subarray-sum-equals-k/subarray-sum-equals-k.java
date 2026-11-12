class Solution {
    public int subarraySum(int[] nums, int k) {
        Map < Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int currentSum = 0;
        
        for(int num:nums){
            currentSum+=num;

            int req = currentSum-k;
            if(map.containsKey(req)){
                count+= map.get(req);
            }
            map.put(currentSum,map.getOrDefault(currentSum, 0) + 1);
        }

        
return count;
    }
}