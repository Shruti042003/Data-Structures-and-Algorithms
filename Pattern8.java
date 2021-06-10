/*
				*	
			*		
		*			
	*				
*
*/
import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = n;
        int nstar = 1;
        for(int i = 1; i <= n; i++){
            nspace -= 1;
            for(int j = 1; j <= nspace; j++){
                System.out.print("\t");
            }
            for(int k = 1; k <= nstar; k++){
                System.out.print("*\t");
            }
            System.out.println( );
        }
    }
}