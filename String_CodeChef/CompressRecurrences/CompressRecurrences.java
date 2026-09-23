import java.util.Scanner;

public class CompressRecurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int count = 1;

        String s = sc.next();
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                if(count>=n){
                    sb.append(s.charAt(i)).append(count);
                }
                else{
                    for(int j=0; j < count;j++){
                        sb.append(s.charAt(i));
                    }
                }
                count=1;
            }
        }
        System.out.println(sb.toString());
    }
}

