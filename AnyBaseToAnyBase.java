import java.util.Scanner;
public class AnyBaseToAnyBase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int sum = 0;
        int pow = 1;
        while(a > 0){
            int dig = a % 10;
            sum += dig * pow;
            pow *= b1;
            a /= 10;
        }
        int power = 1;
        int res = 0;
        while(sum > 0){
            int digit = sum % b2;
            res += digit * power;
            power *= 10;
            sum /= b2;
        }
        System.out.println(res);
    }
}