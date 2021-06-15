
import java.util.Scanner;
public class firstindexandlastindex {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int index = -1;
        int firstindex = 0;
        int lastindex = 0;
        for(int i = 0; i < n; i++){
            if(d == arr[i]){
                firstindex = i;
                index ++;
                if(index == 0){
                    lastindex = i;
                }
            }
        }
        System.out.println(lastindex);
        System.out.println(firstindex);
    }
}

 

