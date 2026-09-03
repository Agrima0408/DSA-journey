import java.util.Arrays;
import java.util.Scanner;

public class NaniHouse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        
        int weight=0,toys=0;
        for(int i=0;i<n;i++){
            weight+=arr[i];
            if(weight<=5000){
                toys++;
            }
        }
        System.out.println(toys);
    }
}
