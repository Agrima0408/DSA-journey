class Solution {
    public int capacitytoship(int[] weights , int days , int capacity){
        int ship =1 , shipcap=0;; 
        for(int w:weights){
            shipcap +=w;
            if(shipcap>capacity){
                ship++;
                shipcap=w;
            }
        }
        return ship;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = 0 , right=0 ,ans=0;
        for(int w:weights){
            left = Math.max(left,w);
            right+=w;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(capacitytoship(weights , days , mid)<=days){
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