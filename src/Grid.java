import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class Grid {

    private static boolean flag = true;

    public static void main(String[] args) {

        List<String> list = Arrays.asList(new String("abcde\n" +
                "fghij\n" +
                "klmno\n" +
                "pqrst\n" +
                "uvwxy").split("\n"));

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for (int i = 0; i < total; i++) {

        }


        for (int i = 0; i < list.size(); i++) {
            Arrays.sort(list.get(i).toCharArray());
            list.set(i,list.get(i));
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i).charAt(0)>list.get(i+1).charAt(0)) {
                System.out.println(list.get(i));
            }
        }

        if (flag) {
            System.out.println("True");
        } else
            System.out.println("False");


    }
}
