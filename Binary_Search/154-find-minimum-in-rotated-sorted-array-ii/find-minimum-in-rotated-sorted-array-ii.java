class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans=nums[0];
        while(left<=right){
            int mid= left+(right-left)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[mid]<nums[right]){
                right=mid-1;
            }
            else if (nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=right-1;
            }
        }
        return ans;
    }
}