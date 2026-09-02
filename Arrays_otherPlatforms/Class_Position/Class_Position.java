import java.util.Scanner;

public class ClassPosition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int[] pos= new int[n];

        for(int i=0;i<n;i++){

            arr[i]= sc.nextInt();

        }

        for(int i=0;i<n;i++){

            int rank=1;

            for(int j=0;j<n;j++){

            if(arr[j]>arr[i]){

                rank++;

            }

        }

        pos[i]=rank;

        }

        for(int i=0;i<n;i++){

            System.out.print(pos[i]);

        }

    }

}
