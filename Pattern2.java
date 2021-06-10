/* 
     *	*	*	*	*	
     *	*	*	*	
     *	*	*	
     *	*	
     *
*/
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= temp; j++){
                System.out.print("*\t");
            }
            temp--;
            System.out.println( );
        }
    }
}
