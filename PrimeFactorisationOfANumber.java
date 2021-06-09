/*  1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.*/
import java.util.Scanner;
public class PrimeFactorisationOfANumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        for(int i = 2; i * i <= temp; i++){
            while(temp % i == 0){
                System.out.println(i);
                temp /= i;
            }
        }
        if(temp != 1){
            System.out.println(temp);
        }
    }
}
