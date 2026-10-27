import java.io.*;
import java.util.*;

class Solution {
    public String sumEqualsToSum(int[] arr) {
        if (arr == null || arr.length < 4) {
            return "No";
        }
   
        HashSet<Integer> seenSums = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (seenSums.contains(sum)) {
                    return "Yes";
                }
            }
            for (int j = 0; j < i; j++) {
                seenSums.add(arr[i] + arr[j]);
            }
        }
        
        return "No";
    }
}
