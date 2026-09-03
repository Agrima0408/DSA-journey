import java.util.Scanner;

public class countofinstances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int m = s1.length();
        int n = s2.length();
        int count;

        for(int i=0;i<m;i++){
            count=0;
            char ch1 = s1.charAt(i);

            for(int j=0;j<n;j++){
              char ch2 = s2.charAt(j);
                if(ch1 == ch2){
                   count++;
            }
        }
        System.out.print(count + "");
    }
}
}
