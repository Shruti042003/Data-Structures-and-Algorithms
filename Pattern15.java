/* 
        1	
    2	3	2	
3	4	5	4	3	
    2	3	2	
        1	
*/

import java.util.Scanner;
public class Pattern15{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nstar = 1;
        int nspace = n/2;
        int val = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= nspace; j++){
                System.out.print("\t");
            } 
            int cval = val;          
            for(int k = 1; k <= nstar; k++){
                System.out.print( cval +"\t");
                if(k <= nstar / 2 ){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i <= n / 2 ){
                nspace--;
                nstar += 2;
                val++;
            }
            else{
                nspace++;
                nstar -= 2;
                val--;
            }
            System.out.println();
        }
    }
}