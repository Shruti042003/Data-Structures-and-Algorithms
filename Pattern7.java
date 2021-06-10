/*
	*	
		*	
			*	
				*	
*/ 
import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nspace = 0;
        int nstar = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nspace; j++){
                System.out.print("\t");
            }
            nspace++;
            for(int k = 1; k <= nstar; k++){
                System.out.print("*\t");
            }
            System.out.println( );
        }
    }
}
