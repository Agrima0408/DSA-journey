import java.util.Scanner;

public class removeFromSelected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuilder ans = new StringBuilder();
      
        for(int i=0;i<s1.length();i++){
            boolean found = false;
          
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    found = true;
                    break;
                }
            }
          
            if (!found) {
                ans.append(s1.charAt(i));
            }
        }
      
        System.out.println(ans.toString());
    }
}
