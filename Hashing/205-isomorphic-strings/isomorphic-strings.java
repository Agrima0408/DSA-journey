class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        Map<Character,Character>map1=new HashMap<>();
        Map<Character,Character>map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map1.getOrDefault(ch1, ch2) != ch2 || map2.getOrDefault(ch2, ch1) != ch1) {
                return false;
            }

            map1.put(ch1,ch2);
            map2.put(ch2,ch1);
        }
        return true;
    }
}