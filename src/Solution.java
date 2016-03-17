import java.util.*;
/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=0, s=0, w=0, e=0;

        for(char c: str.toCharArray()) {
            switch (c){
                case 'N':  { n++; break; }
                case 'S':  { s++; break; }
                case 'E':  { e++; break; }
                case 'W':  { w++; break; }
                default: break;
            }
        }

        if(n>s) {
            n = n - s;
            s = 0;
        }    else {
            s = s - n;
            n = 0;
        }

        if(e>w) {
            e = e - w;
            w = 0;
        } else {
            w = w - e;
            e = 0;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < e; i++) {
            stringBuilder.append("E");
        }
        for (int i = 0; i < n; i++) {
            stringBuilder.append("N");
        }
        for (int i = 0; i < s; i++) {
            stringBuilder.append("S");
        }
        for (int i = 0; i < w; i++) {
            stringBuilder.append("W");
        }

        System.out.println(stringBuilder);
    }
}
