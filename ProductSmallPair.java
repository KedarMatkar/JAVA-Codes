import java.util.Arrays;
import java.util.Scanner;

public class ProductSmallPair {
    public void product(int arr[], int sum) {
        int add = 0;
        Arrays.sort(arr);
        add = arr[0]+arr[1];
        if(add < sum) {
            int product = arr[0]*arr[1];
            System.out.println("Output: "+product);
        }
    }
    public static void main(String[] args) {
        ProductSmallPair t = new ProductSmallPair();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements:");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter sum:");
        int sum = sc.nextInt();
        t.product(arr, sum);
    }
}