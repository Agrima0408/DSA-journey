similarily give related questions and readme for - import java.io.*;
import java.util.*;

class Solution {
    public static List<int[]> integerSquareMap(int[] arr) {
        // Write Your Code
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],arr[i]*arr[i]);
        }
        List<int[]> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            ans.add(new int[]{entry.getKey(),entry.getValue()});
        }
        return ans;
    }
}
