/*
*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*
*/
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = 0;
        int temp1 = num;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= temp; j++){
                System.out.print("\t");
            }
            temp++;
            for(int k = 1; k <= temp1; k++){
                System.out.print("*\t");
            }
            temp1--;
            System.out.println( );
        }
    }
}
