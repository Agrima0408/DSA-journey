import java.util.Scanner;

public class nextgreater {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        int arr[]=new int[n];

        int greater[]=new int[n];

        int i,j,max=0;

        for( i=0;i<n;i++){

            arr[i]=sc.nextInt();

        }

        for( i=0;i<n;i++){

            max=0;

            for( j=i+1;j<n;j++){

            if(arr[j]>arr[i]){

                max=arr[j];

                break;

            }   

        }

        greater[i]=max;

    }

        for(i=0;i<n;i++){

            System.out.print(greater[i]+"\t");

        }

    }

}
