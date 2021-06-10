/*    
      num = 3;
      *	
      *	  *
      *   *   *
*/
import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
            System.out.println(" ");
        }        
    }
}
