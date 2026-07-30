class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left =0;
        double avg,sum=0,ans=0;
        for(int right=0;right<k;right++){
            sum+=nums[right];
        }
        avg=(double)sum/k;
        ans=avg;
        for(int right=k;right<nums.length;right++){
            sum+=nums[right];
            sum-=nums[left];
            left++;
            avg=(double)sum/k;
            ans=Math.max(ans,avg);
        }
        return ans;
    }
}