
import java.util.Scanner;
public class brokeneconomy {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int low = 0;
        int high = n - 1;
        int ceil = 0;
        int floor = 0;
        while(low <= high){
            int mid = (low + high) / 2;
            if(d > arr[mid]){
                low = mid + 1;
                ceil = arr[mid];
            }
            else if(d < arr[mid]){
                high = mid - 1;
                floor = arr[mid];
            }
            else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}

