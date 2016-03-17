import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class Solution2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> inputData = new ArrayList<Integer>();
        for (int i = 0; i < N; i++)
            inputData.add(sc.nextInt());

//        TreeSet<Integer> mySet = new TreeSet<Integer>();
//        for (int i = 0; i < N; i++)
//            mySet.add(sc.nextInt());

        int index = sc.nextInt();
/*
        for(Integer integer : mySet) {
            for (Integer integer1 : mySet) {
                Integer z = integer - integer1;
                if(!mySet.contains(z) && z>1) {
                    mySet.add(z);
                }
            }
        }

        mySet.pollLast();
        System.out.println(mySet.pollLast());*/

        for (int i = 0; i < inputData.size()-1; i++) {
            for (int j = 0; j < inputData.size(); j++) {
                if(i==j) { continue; }
                int z = inputData.get(j) - inputData.get(i);
                if(!inputData.contains(z) && z>=1) {
                    inputData.add(z);
                }
            }
        }

        Collections.sort(inputData);
        System.out.println(inputData.get(inputData.size() - index));

    }

}
