which question of leetcode suits this ans - import java.io.*;
import java.util.*;

class Solution {
    public static int uniqueNonUniqueProduct(int[] arr) {
        // Write Your Code
        
        int uni=0,notuni=0;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer>entry :map.entrySet()){
            if(entry.getValue()==1){
                uni++;
            }
            else{
                notuni++;
            }
        }
        return uni*notuni;
    }
}
