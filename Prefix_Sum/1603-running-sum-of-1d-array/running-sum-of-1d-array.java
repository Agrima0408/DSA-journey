class Solution {
    public int[] runningSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1;i<nums.length;i++){
            list.add(list.get(i-1)+nums[i]);
        }
        int[] arr = new int[nums.length];
        int x=0;
        for(int i : list){
            arr[x++]= i;
        }
        return arr;
    }
}