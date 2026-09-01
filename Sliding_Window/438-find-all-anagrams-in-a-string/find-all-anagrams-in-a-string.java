class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       ArrayList <Integer> list = new ArrayList<>() ;
       if (s.length() < p.length()) return list;
       int left=0;
       StringBuilder anagram = new StringBuilder();
       
       //first window
       for(int right=0;right<p.length();right++){
        anagram.append(s.charAt(right));
       }
       if (isAnagram(anagram.toString(), p)){
            list.add(left);
        }
        
        //sliding window
       for(int right=p.length();right<s.length();right++){
        anagram.append(s.charAt(right));
        anagram.deleteCharAt(0);
        left++;

        if (isAnagram(anagram.toString(), p)){
            list.add(left);
        }

       }
        
       return list;
    }
    private boolean isAnagram(String a, String b) {
        int[] freq = new int[26]; 
        for (int i = 0; i < a.length(); i++) { 
            freq[a.charAt(i) - 'a']++; 
            freq[b.charAt(i) - 'a']--; 
            }
            for (int x : freq) { 
                if (x != 0){ 
                return false; 
            }
        } 
        return true;
    }
}
