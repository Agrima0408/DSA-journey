import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String abbString = sc.next();

        if(isValid(s,abbString)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }            
    }
    
    static boolean isValid(String s , String abbString){
        if(abbString.length()<3 && abbString.length()>5) return false;

        int i =0 ,j=0;
        while(i<s.length() && j<abbString.length()){
            if(s.charAt(i)==abbString.charAt(j)){
                j++;
            }
            i++;
        }

        return j==abbString.length();
    }
}
