import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sohiljain.cs91 on 27-02-2016.
 */
public class WordsInALine {
    public static void main(String[] args) {

        int m = 4, n=40;
        List<String> words = Arrays.asList("This is my world".split(" "));
        List line = new ArrayList();
        int wc = 0;

        for (int j = 0; j < m; j++) {
            int size = 0;
            sizeLoop:
            for (int i = 0; i <= words.size(); i++) {
                if (i == words.size()) i = 0;
                if(size<n) {
                    String word = words.get(i);
                    size += (word.length() + 1);
                    wc += 1;
                } else {
                    break sizeLoop;
                }
            }
        }
        System.out.println(wc);
    }
}
