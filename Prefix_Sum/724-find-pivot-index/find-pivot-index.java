class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for(int i = 1 ;i <n;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        int pivot = -1,sumleft=0,sumright=0;
        for(int i = 0 ;i<n;i++){
            sumleft = (i == 0) ? 0 : prefixSum[i - 1];
            sumright=prefixSum[n-1]-prefixSum[i];
            if(sumright==sumleft){
                pivot = i;
                break;
            }
            
        }
        return pivot;
    }
}