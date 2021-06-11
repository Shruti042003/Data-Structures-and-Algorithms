import java.util.Scanner;
public class DigitFrequency{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sam = scn.nextInt();
        int count = 0;
        while(n > 0){
            int dig = n % 10;
            if(dig == sam){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}

