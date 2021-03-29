import java.util.Scanner;

public class countDigit {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int temp = a;
        int count = 0;
        while(a>0){
            a = a / 10 ;
            count = count + 1;
        }
        System.out.println("NUMBER OF DIGIT IN " + temp + " is " +  count);

    }

}
    

