import java.util.Scanner;
public class Pattern16{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = (n * 2) - 1;
        for(int i = 1; i <= n; i++){
            int xy = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(xy + "\t");
                xy++;
            }
            nspace -= 2;
            for(int k = 1; k <= nspace; k++){
                if(nspace >= 1){
                     System.out.print("\t");
                }
            }
            int uv = i;
            if(uv == n){
                uv -= 1;
            }
            int yz = xy;
            if(i == n){
                yz--;
            }
            for(int l = 1; l <= uv; l++){                
                yz--;
                System.out.print( yz + "\t");
            }
            System.out.println( );
        }
    }
}