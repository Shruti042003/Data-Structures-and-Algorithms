/*1. You've to display the digits of a number in reverse.
2. Take as input "n", the number for which digits have to be display in reverse.
3. Print the digits of the number line-wise, but in reverse order.*/
import java.util.Scanner;
public class ReverseANumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num;
        int count = 0;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        int pow = count;
        int sum = 0;
        for(int i = 1; i <= count; i++){
            int digit = num % 10;
            pow--;
            sum += digit * Math.pow(10 , pow);
            num /= 10;
        }
        System.out.println(sum);
    }
}
