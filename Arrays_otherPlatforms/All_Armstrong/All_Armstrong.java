import java.util.ArrayList;
import java.util.Scanner;

public class allArmstrong {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        for(int i=x;i<y;i++){
           if(isArmstrong(i)) list.add(i);
        }
        if (list.isEmpty()) {
            System.out.print(-1);
        } else {
            System.out.print(list);
        }
    }

    static boolean isArmstrong(int num){
        int sum=0,temp=num;
        int len = String.valueOf(num).length();
        while(temp>0){
        int digit = temp %10;
        temp/=10;
        sum += Math.pow(digit,len);
        }
        return sum==num;
    }
    
}
