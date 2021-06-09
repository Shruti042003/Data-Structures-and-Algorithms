/*1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).*/
import java.util.Scanner;
public class PrintAllPrimeTillN {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  low = scn.nextInt();
        int high = scn.nextInt();
        for(int i = low; i <= high; i++){
            int count = 0;
            for(int j = 2; j * j<= i; j++){
                if(i % j == 0){
                    count++;
                }               
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
