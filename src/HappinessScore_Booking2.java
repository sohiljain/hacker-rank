import java.util.*;

public class HappinessScore_Booking2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TreePreOrder. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        int sum = 0;
        Set<Integer> out = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = j; k < n ; k++) {
                    sum = 0;
                    for (int l = k; l >= (k+1)-(j-i); l--) {
                        sum += arr.get(l);
                    }
                    out.add(sum);
                }
            }
            
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i : out) {
            if (isPrime(i))
                list.add(i);
        }

//        System.out.println(list.size());
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