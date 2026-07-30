class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left=0,right,count=0;
        double sum=0,avg;
        for(right=0;right<k;right++){
            sum+=arr[right];
        }
        avg=(double)sum/k;
        if(avg>=threshold) count++;
        for(right=k;right<arr.length;right++){
            sum+=arr[right];
            sum-=arr[left];
            left++;
            avg=(double)sum/k;
           if(avg>=threshold) count++;
        }
        return count;
    }
}