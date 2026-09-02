import java.util.Arrays;
import java.util.Scanner;

public class sumMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int[] nums1 = new int[2*n];
        int[] nums2 = new int[n];
        for (int idx = 0; idx < n; idx++) {
            nums1[idx] = sc.nextInt();
        }
        for (int idx = 0; idx < n; idx++) {
            nums2[idx] = sc.nextInt();
        }
        
        int i = n - 1;       
        int j = n - 1;       
        int k = 2*n - 1;   

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
        int mid1 = nums1[n - 1];
        int mid2 = nums1[n];
        int midSum = mid1 + mid2;
        System.out.println(midSum);
    }
}
