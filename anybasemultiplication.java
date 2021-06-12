import java.util.Scanner;
public class anybasemultiplication{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int base = scn.nextInt();
        int num1 = 0;
        int num2 = 0;
        int pow = 1;
        while(a > 0){
            int digit = a % 10;
            num1 += digit * pow;
            pow *= base;
            a /= 10;
        }
        pow = 1;
        while(b > 0){
            int digit1 = b % 10;
            num2 += digit1 * pow;
            pow *= base;
            b /= 10;
        }     
        int mul = num1 * num2;
        pow = 1;
        int res = 0;
        while(mul > 0){
            int dig = mul % base;
            res += dig * pow;
            mul /= base;
            pow *= 10;
        }
        System.out.println(res);   
    }
}