import java.util.Scanner;

public class moveSections {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int index=0;

        int n = s.length();

        String ans ="";

        String reqchar="";

        for(int i=0;i<n;i++){

            index =i+1;

            if(index%4==0 || index%6 == 0){

                reqchar += s.charAt(i);

            }

            else{

                ans += s.charAt(i);

            }

        }

        ans = ans + reqchar;

        System.out.println(ans);

    }

}
