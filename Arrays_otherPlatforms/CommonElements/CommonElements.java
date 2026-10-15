import java.io.*;
import java.util.*;

public class Main {
    static class Solution {
        public List<Integer> commonElements(int[][] arr) {
            if (arr == null || arr.length == 0) {
                return Arrays.asList(-1); 
            }

            Set<Integer> Set = new HashSet<>();
            for (int num : arr[0]) {
                Set.add(num);
            }

           
            for (int i = 1; i < arr.length; i++) {
                Set<Integer> currSet = new HashSet<>();
                for (int num : arr[i]) {
                    currSet.add(num);
                }
             Set.retainAll(currSet);
            }

            List<Integer> list= new ArrayList<>(Set);
            Collections.sort(list);

            if (list.isEmpty()) {
                list.add(-1);
            }

            return list;
        }
    }
}
