import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class WordCountCoRo {
    private Map<String, Integer> wordCounts;
    private int total;
    private Set<String> wordSet;
    public WordCountCoRo(String fileName) throws FileNotFoundException {
        if (fileName == null) {
            throw new FileNotFoundException();
        }
        Scanner s = new Scanner(new File(fileName));
        this.wordCounts = new HashMap<>();
        this.total = 0;
        while(s.hasNext()) {
            String word = s.next().replaceAll("\"","");
           word =  word.replace(".","");
            word = word.replace(",", "");
            word = word.replace(" ", "");
            if (wordCounts.containsKey(word)) {
                int currVal = wordCounts.get(word);
                wordCounts.replace(word, currVal + 1);
            }
            else {
                wordCounts.put(word, 1);
                this.total++;
            }
        }
        this.wordSet = wordCounts.keySet();
    }
        public void printIt() {
            System.out.println("Total words: " + this.total);
            //this.wordSet.stream().map(a -> System.out.println(a + " : " + wordCounts.get(a)));
            for(Object st: wordSet) {
                System.out.println(st + " : " + wordCounts.get(st));
            }
        }
    
    public static void main(String[] args) throws FileNotFoundException {
        WordCountCoRo wc = new WordCountCoRo("i-have-a-dream.txt");
        System.out.println("Total words: " + wc.total);
        wc.printIt();
    }
}