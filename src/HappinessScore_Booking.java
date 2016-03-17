import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappinessScore_Booking {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TreePreOrder. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Set<Integer> out = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int sum = arr.get(i);
            for (int j = i+1; j < n; j++) {
                int sum2 = arr.get(i) + arr.get(j);
                if(isPrime(sum2))
                    out.add(sum2);

                sum += arr.get(j);
                if(isPrime(sum))
                    out.add(sum);

            }
        }
        for (int i : arr) {
            if (isPrime(i))
                out.add(i);
        }

//        System.out.println(out.size());
        for (int i : out)
            System.out.println(i);
    }

    static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < n-1 ; i++) {
            if(n%i==0)
                flag = false;
        }
        if(n==1 || n==0)
            flag = false;

        return flag;
    }
}