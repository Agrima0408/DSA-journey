class Solution {
    public int possibleB(int[] bloomDay, int m, int k , int day){
        int count =0 , b = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                b+=(count/k);
                count=0;
            }
        }
        b+=(count/k);
        return b;
    }
    public int minDays(int[] bloomDay, int m, int k) {
       int left=0,right=0,ans=-1;
    //    if((long)m*k>bloomDay.length){
    //     return -1;
    //    }

       for(int day: bloomDay){
        left = Math.min(left,day);
        right = Math.max(right,day);
       }
       while(left<=right){
        int mid=left+(right-left)/2;
        if(possibleB(bloomDay,m,k,mid)>=m){
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