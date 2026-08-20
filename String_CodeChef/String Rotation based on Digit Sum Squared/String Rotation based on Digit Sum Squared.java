import java.util.Scanner;

public class Krotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int k=0;
        String str="";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int digit = Character.getNumericValue(ch);
                k+= Math.pow(digit,2);

                //k+=(i-'0')*(i-'0');
        }
        if(Character.isAlphabetic(ch)){
            str+=ch;
        }
    }
    if(k%2==0){ //right rotation
        int m = str.length();
        if(k>m) k=k%m;
        System.out.println(str.substring(m-k)+str.substring(0,m-k));
    }
    else{ //left rotation
        int m = str.length();
        if(k>m) k=k%m;
        System.out.println(str.substring(k,m)+str.substring(0,k));
    }
    }
}
