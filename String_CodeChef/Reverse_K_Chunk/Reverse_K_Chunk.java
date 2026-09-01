import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        String ans = "";
        System.out.println(n); 
        System.out.println(s); 
        for(int i =0;i<n;i+=2*k){
            String first =s.substring(i,i+k);
            String second =s.substring(i+k,i+2*k);
            ans += first + new StringBuilder(second).reverse();
        }
        System.out.println(ans);
    }
}
