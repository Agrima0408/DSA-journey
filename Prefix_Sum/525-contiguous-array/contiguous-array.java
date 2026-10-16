class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        int maxLen=0,sum=0;

        for(int i=0;i<nums.length;i++){
            sum += (nums[i]==1)? 1:-1;

            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxLen=Math.max(maxLen,len);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}