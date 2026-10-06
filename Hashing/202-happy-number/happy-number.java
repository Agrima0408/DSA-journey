class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        HashSet<Integer> set = new HashSet<>();
        int temp = n,digit=0,next=n;
        while(!set.contains(next)){
            set.add(next);
            next=0;
        while(temp >0){
            digit = temp % 10;
            temp/=10;
            next+=Math.pow(digit,2);
        }
        temp = next;
        if(next==1) return true;
        }
        return false;
    }
}