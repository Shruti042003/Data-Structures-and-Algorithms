import java.util.Scanner;
public class decimaltoanybase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int pow = 1;
        int sum = 0;
        while(a > 0){
            int rem = a % b;
            sum += rem * pow;
            pow *= 10;
            a /= b;            
        }
        System.out.println(sum);
    }
}
