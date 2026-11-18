class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int val= entry.getValue();

            if(key == val){
             list.add(key);
            }
        }
        if(list.isEmpty()) return -1;
        else{
        return Collections.max(list);
        }

    }
}