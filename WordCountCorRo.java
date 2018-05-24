import java.util.HashMap;
import java.util.Scanner;
public class WordCountCoRo {
    private Map<String, Integer> wordCounts;
    private int total;
    public WordCountCoRo(String fileName) throws FileNotFoundException {
        Scanner s = new Scanner(new File(fileName));
        this.wordCounts = new HashMap<>();
        this.total = 0;
        while(s.hasNext()) {
            String word = s.next();
            if (s.containsKey(word)) {
                int currVal = wordCounts.get(word);
                wordCounts.replace(word, currVal + 1);
            }
            else {
                wordCounts.put(word, 1);
                this.total++;
            }
        }
        Set wordSet = s.keySet();
    }
    public static void main(String[] args) {
        System.out.println("Total words: " + this.total);
        wordSet.stream().map(a -> System.out.println(a + " : " + wordCounts.get(a)));
    }
}