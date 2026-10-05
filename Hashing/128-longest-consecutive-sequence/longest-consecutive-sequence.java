class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int longest =0;

        for(int x: set){
            if(!set.contains(x-1)){
                int curr = x;
                int count=1;
            
            while(set.contains(curr+1)){
                count++;
                curr++;
            }
            longest = Math.max(longest, count);
        }
    }
        return longest;
    }
}