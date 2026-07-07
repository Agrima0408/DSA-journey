class Solution {
    public int countedArray(int[] nums, int x){
        int sum=0,count=1;
        for(int num:nums){
        if(sum+num<=x){
            sum+=num;
        }
        else{
            count++;
            sum=num;
        }
    }
    return count;
    }
    public int splitArray(int[] nums, int k) {
        int left=0;
        int right=0;
        int ans=0;
        for(int n:nums){
            left=Math.max(left,n);
            right+=n;
        }
        while(left<=right){
            int mid= left+(right-left)/2;
            int count=countedArray(nums,mid);
            if(count<=k){
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
