/*1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.*/
import java.util.Scanner;
public class GcdAndLcm {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int n1 = num1;
        int n2 = num2;
        int gcd;
        if(n1 % n2 == 0){
            gcd = n2;
        }
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;            
        }
        gcd = n2;
        int lcm = (num1 * num2) / gcd;
        System.out.println( gcd +" " +lcm);
    }
}
