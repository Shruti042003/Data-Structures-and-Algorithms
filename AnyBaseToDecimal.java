import java.util.Scanner;
public class AnyBaseToDecimal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int pow = 1;
        int sum = 0;
        while(a > 0){
            int digit = a % 10;
            sum += digit * pow;
            pow *= b;
            a /= 10;
        }
        System.out.println(sum);
    }
}