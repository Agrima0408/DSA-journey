import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter strings");
        String s = sc.next();
        String t = sc.next();
        String m = "";
        for(int i = 0;i<5;i++){
            if(s.charAt(i)==t.charAt(i)){
                m=m+"G";
            }
            else{
                m=m+"B";
            }
        }
        System.out.println(m);
    }
}
