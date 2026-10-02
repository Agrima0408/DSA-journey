class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List <String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedstr = String.valueOf(arr);

            if(!map.containsKey(sortedstr)){
                map.put(sortedstr , new ArrayList <>());
            }
            map.get(sortedstr).add(str);
        }return new ArrayList<>(map.values());
    }
}