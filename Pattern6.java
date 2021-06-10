import java.util.Scanner;
public class Pattern6{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mid = (n / 2) + 1;
        int nstar = mid ;
        int nspace = 1;
        for(int i = 1; i <= mid; i++){
            
            for(int j = 1; j <= nstar; j++){
                System.out.print("*\t");
            }
            for(int k = 1; k <= nspace; k++){
                System.out.print("\t");
            }
            nspace += 2;
            for(int l = 1; l <= nstar; l++){
                System.out.print("*\t");
            }
            nstar -= 1;
            System.out.println( );
        }
        nstar = 2;
        nspace = n ;
        for(int i = 1; i < mid; i++){
            for(int j = 1; j <= nstar; j++){
                System.out.print("*\t");
            }    
            nspace -= 2;       
            for(int k = 1; k <= nspace; k++){
                System.out.print("\t");
            }
            for(int l = 1; l <= nstar; l++){
                System.out.print("*\t");
            }
            nstar++;
            System.out.println();
        }
    }
}

