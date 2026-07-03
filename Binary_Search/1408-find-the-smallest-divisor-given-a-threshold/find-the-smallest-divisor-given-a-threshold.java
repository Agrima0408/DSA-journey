class Solution {
    public int findDivisor(int[]nums,int threshold,int divisor){
        int sum=0;
        for(int n:nums){
            sum+=Math.ceil((double)n/divisor);
        }
            return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left=0, right=0,ans=0;
        for(int n:nums){
            right=Math.max(right,n);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(findDivisor(nums,threshold,mid)<=threshold){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}