import java.util.Arrays;
import java.util.List;

public class CoinChange_Unsolved {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TreePreOrder. */

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int n = sc.nextInt();

//        List<Integer> a = Arrays.asList(new Integer[]{2,3,5,6});
//        System.out.println(recur(a, a, 10, 0, 0, 0, 0));

        int n = 4, m = 3;
        int []c = new int[]{2,3,5,6};
        int [][]dp = new int[51][251];
        dp[0][0] = 1; // With no coins, we have 1 way to make 0 cents (that is to give nothing).

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 0;
            }
        }
        
        for (int i=1;i<=m;i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= c[i])
                    dp[i][j] = dp[i][j - c[i]] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        System.out.println(dp[m][n]);

    }

    static int recur(List<Integer> a, List<Integer> temp, int n, int count, int i, int j, int k) {
        while(i<a.size()) {
            while (j<a.size()) {
                while (k<a.size()) {
                    k++;
                    if (n % a.get(k) == 0) {
                        count++;
                        recur(a, temp.subList(1, temp.size()), temp.get(0) * 2, count, i, j, k);
                    }
                }
                j++;
                recur(a, temp, n + a.get(0), count, i, j, j);
            }
            i++;
            recur(a.subList(1,a.size()), a.subList(1,a.size()), n, count, i, j, 0);
        }
        return count;
    }
}