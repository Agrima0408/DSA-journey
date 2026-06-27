class Solution {
    public boolean canfinish(int[] piles, int speed , int h){
        int hours=0;
        for(int banana: piles){
            hours+=(banana+speed-1)/speed;
            if(hours>h) return false;
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left=1 , right = 0,ans=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        while(left<=right){
            int mid= left+(right-left)/2;
            if(canfinish(piles,mid,h)){
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