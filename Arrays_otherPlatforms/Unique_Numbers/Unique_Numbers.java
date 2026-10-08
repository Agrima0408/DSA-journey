import java.util.HashSet;
import java.util.Scanner;

class UniqueNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        
        for(int x: arr){
            if(!set.add(x)){
                set.remove(x);
            }
        }
        System.out.print(set);
    }
}
