
import java.util.Scanner;
public class Pattern5{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();        
        int mid = (n / 2) + 1;
        int mid_term = mid - 1;
        int nstar = 1;
        for(int i = 1; i <= mid; i++){
            for(int j = 1; j <= mid_term; j++){
                System.out.print("\t");
            }
            mid_term -= 1;
            for(int k = 1; k <= nstar; k++){
                System.out.print("*\t");        
            }
            nstar += 2;
            System.out.println( );        
        }
        mid_term = 1;
        nstar = n;
        
        for(int i = 1; i < mid; i++){
            for(int j = 1; j <= mid_term; j++){
                System.out.print("\t");
            }
            mid_term += 1;
            nstar -= 2;
            for(int k = 1; k <= nstar; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        
    }
}

