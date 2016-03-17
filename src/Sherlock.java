import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sherlock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named TreePreOrder. */

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int a=0,b=0;
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < total; i++) {
            int n = sc.nextInt();

            if (n < 3) {
                s.append("-1");
                a = 0;
                b = 0;
            } else{
                if (n % 3 == 0) {
                    a = n;
                    b = 0;
                } else if (n % 3 == 1) {
                    a = n - 10;
                    b = 10;
                } else if (n % 3 == 2) {
                    a = n - 5;
                    b = 5;
                }
            }

            for (int j = 0; j < a; j++)
                s.append("5");
            for (int j = 0; j < b; j++)
                s.append("3");

            System.out.println(s);
            s.delete(0,s.length());
        }


    }
}