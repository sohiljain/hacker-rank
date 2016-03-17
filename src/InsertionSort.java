import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TreePreOrder. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            if(arr[i]>temp)
                arr[i+1] = arr[i];
            else {
                arr[i+1] = temp;
                break;
            }
            for (int j = 0; j < n; j++) {
                System.out.println(arr[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

  }
}