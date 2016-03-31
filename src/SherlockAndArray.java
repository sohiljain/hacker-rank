import java.util.Scanner;

/**
 * Created by sohiljain.cs91 on 31-03-2016.
 */
public class SherlockAndArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        for (int count = 0; count < total; count++) {
            boolean flag = false;
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i];
            }

            if(arr.length>1) {
                int last = arr[arr.length - 1];
                forloop:
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] == last - arr[i + 1]) {
                        flag = true;
                        break forloop;
                    }
                }
            } else
                flag = true;

            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

}
