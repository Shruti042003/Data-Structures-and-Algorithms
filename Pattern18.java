import java.util.Scanner;
public class Pattern18{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstar = n;
        int nspace = 0;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= nspace; k++){
                System.out.print("\t");
            }
            for(int j = 1;j <= nstar; j++){
                if(i > 1 && i <= n / 2 && j > 1 && j < nstar){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }            
            if(i <= n / 2){
                nspace++;
                nstar -= 2;
            }
            else{
                nspace--;
                nstar += 2;
            }
            System.out.println( );
        }
    }
}