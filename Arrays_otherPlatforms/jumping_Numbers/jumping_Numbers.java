import java.util.ArrayList;
import java.util.Scanner;

public class jumpingNumbers {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0;i<=x;i++){
            if(isJumping(i)) list.add(i);


            // int len = String.valueOf(i).length();
            // digit = temp%10;
            // diff=  Math.abs(digit-diff);
            // temp/=10;
            // if(diff == 1) list.add(i);
            
        }
        System.out.print(list);
    }   
    static boolean isJumping(int num){
        if(num<10) return true;
        int diff =0,d1=0,d2=0,temp=num;
        while(temp>=10){
        d1=temp%10;
        temp/=10;
        d2=temp%10;
        diff=Math.abs(d1-d2);
        if(diff != 1) return false;
    }
    return true;
}
}
