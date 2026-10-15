class Solution {
    public String twoSum(int[] arr, int X) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            int req = X - arr[i];
  
            if (set.contains(req)) {
                return "YES";
            }

            set.add(arr[i]);
        }

        return "NO";
    }
}
