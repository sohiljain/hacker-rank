import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class LisaWorkbook {
    private static int count = 0;
    private static int l1 = 0;
    private static int l2 = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int total = sc.nextInt();
//        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int reps = str.length()/4;
        Map<Character, Integer> map = new HashMap<>(4);
        map.put('A',0);map.put('C',0);map.put('G',0);map.put('T',0);

        
//        char []chars = str.toCharArray();
//        Arrays.sort(chars);
//        System.out.println(chars);
        forloop:
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch,map.get(ch)+1);
//            if (map.containsValue(reps+1)) {
//                for (Character character : map.keySet()) {
//                    if(map.get(character).equals(reps+1)) {
//                        map.remove(character);
//                        l1 = i;
//                        break forloop;
//                    }
//                }
//            }
        }

        if(l1==0)
            System.out.println(l1);
        else {
            for (int i = str.length() - 1; i > 0; i--) {
                char ch = str.charAt(i);
                if (!map.containsKey(ch) || map.containsValue(reps + 1)) {
                    l2 = i;
                    break;
                }
                map.put(ch, map.get(ch) + 1);
            }
            System.out.println(l2 - l1 + 1);
        }
    }
}
