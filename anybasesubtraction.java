import java.util.Scanner;
import java.util.stream.BaseStream;
public class anybasesubtraction{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int base = scn.nextInt();
        int sub1 = 0;
        int sub2 = 0;
        int pow = 1;
        while(n1 > 0){
            int digit = n1 % 10;
            sub1 += digit * pow;
            pow *= base;
            n1 /= 10;
        }
        pow = 1;
        while(n2 > 0){
            int digit1 = n2 % 10;
            sub2 += digit1 * pow;
            pow *= base;
            n2 /= 10;
        }                
        int sub ;
        if(sub1 > sub2){
            sub = sub1 - sub2;
        }
        else{
            sub = sub2 - sub1;
        }        
        pow = 1;
        int res = 0;
        while(sub > 0){
            int dig = sub % base;
            res += dig * pow;
            sub /= base;
            pow *= 10;
        }
        System.out.println(res);
    }
}
