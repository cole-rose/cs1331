import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class WordCount {
        public WordCount(String fileName) throws FileNotFoundException {
            Scanner sc = new Scanner(new File(fileName));
            Map<String, Integer> wordCounts = new HashMap<>();
            while (sc.hasNext()) {
                String word  = sc.next();
                if(wordCounts.keySet().contains(word)) {
                    int curCount = wordCounts.get(word);
                    wordCounts.put(word, curCount + 1);
                } else {
                    wordCounts.put(word, 1);
                }
            }


        }
        public int count(String word) {
            return 1;
        }
        public Set words

        public static void main(String[] args) throws Exception {
            WordCount wc = new WordCount(args[0]);
            for (String word: wc.words()) {
                System.out.printf("%s: %d%n", word, wc.count(word));
            }
        }       
  }
    }
