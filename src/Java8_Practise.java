import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class Java8_Practise {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        names.stream().filter((s) -> s.endsWith("a")).forEach(System.out::print);

        

/*

        System.out.println(names);
        names.forEach(System.out::print);

        System.out.println(Collections.max(names));
*/

    }
}
