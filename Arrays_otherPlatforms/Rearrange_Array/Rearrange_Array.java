import java.util.Arrays;
import java.util.Scanner;
public class RearrangeArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int left=0,right=n-1;
        
        // for(int i=0;i<n;i++){
        //     if(i%2==0){
        //         System.out.print(arr[i/2]+" ");
        //     }
        //     else{
        //         System.out.print(arr[n-1-i/2]+" ");
        //     }
            
        // }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even index largest element
                ans[i] = arr[right];
                right--;
            } else {
                // Odd index smallest element
                ans[i] = arr[left];
                left++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);
        }
}

}
