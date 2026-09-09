import java.util.Scanner;

public class ReverseLettersOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int left=0;
        int right = arr.length-1;

        while(left<right){
             if (!Character.isAlphabetic(arr[left])) {
                left++;
            }
            else if (!Character.isAlphabetic(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        System.out.println(new String(arr));
    }
}
