class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,ans;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right=mid-1;
                ans=right;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}
