import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class GreedyFlorist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TreePreOrder. */

        long answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int reps = n/k;
        int extra = n%k;

        Stack<Integer> arr = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        for (int i = 0; i < reps; i++) {
            for (int j = 0; j < k; j++) {
                answer += (i+1)*arr.pop();
            }
        }

        for (int i = 0; i < extra; i++) {
            answer += (reps+1)*arr.pop();
        }

        System.out.println(answer);
   }
}