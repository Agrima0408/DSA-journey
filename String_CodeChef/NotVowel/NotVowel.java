import java.util.ArrayList;
import java.util.Scanner;

public class NotVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            String s = sc.next();
            boolean isvowel =  false ;
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
               if(ch=='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch =='A' || ch == 'E' || ch == 'I' || ch=='O'|| ch=='U'){
                    isvowel = true;
                    break;
                }
            // list.add(sc.next());
        }
        if(!isvowel){
            list.add(s);
            found = true;
        }
    }
    if(!found){
        System.out.println(-1);
    }
    else{
         System.out.println(list);
    //    for (String str : list) {
    //             System.out.println(str);
    //         }
    }
}
}
