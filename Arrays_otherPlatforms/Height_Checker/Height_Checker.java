import java.util.Scanner;
import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] expected = arr.clone();
        Arrays.sort(expected);
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != expected[i]) {
                count++;
            }
        }
        System.out.println("output-" + count);
    }
}
