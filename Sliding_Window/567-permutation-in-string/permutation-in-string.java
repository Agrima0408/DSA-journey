class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0,right;
        int[] s1freq = new int[26];
        int[] winfreq = new int[26];
        //to check s1freq
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            s1freq[ch-'a']++;
        }
        //first window
        if (s1.length() > s2.length()) {
    return false;
}
        for(right=0;right<s1.length();right++){
            char ch= s2.charAt(right);
            winfreq[ch-'a']++;
        }
            if (Arrays.equals(s1freq, winfreq)) {
            return true;
        }
        //window for rest string
        for(right=s1.length();right<s2.length();right++){
            char ch= s2.charAt(right);
            winfreq[ch-'a']++;
            winfreq[s2.charAt(left)-'a']--;
            left++;
            if (Arrays.equals(s1freq, winfreq)) {
            return true;
            }
        }
        return false;
    }
}