class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int x: nums1){
            set.add(x);
        }
        for(int y: nums2){
            if(set.contains(y)){
                set2.add(y);
            }
        }
        int i=0;
        int[] ans = new int[set2.size()];
        for(int num : set2){
            ans[i++]=num;
        }
        return ans;
    }
}