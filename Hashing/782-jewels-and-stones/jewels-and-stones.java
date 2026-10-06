class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(char ch : jewels.toCharArray()){        
            set.add(ch);
        }
        for(int i = 0; i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}