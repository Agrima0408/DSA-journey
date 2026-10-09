class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length()!=words.length)return false;
        Map<Character,String>map1 = new HashMap<>();
        Map<String,Character>map2 = new HashMap<>();

        for(int i = 0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String word = words[i] ;
            if(!map1.getOrDefault(ch,word).equals (word) || map2.getOrDefault(word,ch)!=ch){
                return false;
            }

            map1.put(ch,word);
            map2.put(word,ch);
        }
        return true;
    }
}