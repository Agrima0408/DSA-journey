import java.util.Scanner;

public class mileage_matters{
    public static void main(String[] args) {
        int n,x,y,a,b,petrol,diesel;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        petrol=n/2;
        diesel=n/4;
        if(petrol*x<diesel*y){
            System.out.println("PETROL");
        }
        else if(petrol*x>diesel*y){
            System.out.println("DIESEL");
        }
        else{
            System.out.println("ANY");
        }


    }
}
