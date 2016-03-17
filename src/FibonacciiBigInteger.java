import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciiBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TreePreOrder. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(recur(n,b,a));
    }

    static BigInteger recur(int n, int b, int a) {
        if(n>2) {
            BigInteger t2 = recur(n-1,b,a);
            BigInteger t1 = recur(n-2,b,a);
            BigInteger t3 = t2.multiply(t2).add(t1);
            return t3;
        } else if(n==2){
            return new BigInteger(String.valueOf(b));
        } else if(n==1)
            return new BigInteger(String.valueOf(a));
        else {
            System.exit(1);
            return new BigInteger(String.valueOf(1));
        }
    }
}


