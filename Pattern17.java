import java.util.Scanner;
public class Pattern17{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = (n / 2);
        int nstar = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nspace; j++){
                if(i == (n / 2) + 1 ){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            for(int k = 1; k <= nstar; k++){
                System.out.print("*\t");
            }
            if(i <= (n / 2) ){
                nstar++;
            }
            else{
                nstar--;
            }
            System.out.println( );
        }
    }
}