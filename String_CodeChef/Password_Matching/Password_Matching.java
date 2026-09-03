import java.util.Scanner;
public class PasswordMatching{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r=sc.next();
        int t=sc.nextInt();
        int rotate=0;
        while(t-->0){
            rotate+=sc.nextInt();
        }
        int n=s.length();
        if(n!=r.length()){
            System.out.println("try again");
            sc.close();
            return;

        }
        rotate=rotate%n;
        if(rotate<0){
            rotate+=n;
        }
        String rotated=s.substring(n-rotate)+s.substring(0,n-rotate);
        if(rotated.equals(r)){
            System.out.println("password accepted");
        }else{
            System.out.println("try again");
        }
        sc.close();
    }
    }
