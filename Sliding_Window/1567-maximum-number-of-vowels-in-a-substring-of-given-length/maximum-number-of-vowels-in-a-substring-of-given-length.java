class Solution {
    public int maxVowels(String s, int k) {
        int left=0,right,count=0;
        for(right=0;right<k;right++){
            if(isVowel(s.charAt(right))){
                count++;
        }
        }
        int maxCount=count;
        for(right=k;right<s.length();right++){
            if(isVowel(s.charAt(right)))
                count++;
            if(isVowel(s.charAt(right-k))) 
                count--;
            
            maxCount=Math.max(maxCount,count);
    }
    return maxCount;
    }
    private boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}