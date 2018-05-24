import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cats {

    public static void main(String[] args) {
        List<Cat> cats =
            Arrays.asList(new Cat("Chloe", LocalDate.of(2013, 4, 20), 40),
                          new Cat("Bailey", LocalDate.of(2011, 5, 5), 50),
                          new Cat("Sophie", LocalDate.of(208, 1, 1), 50),
                          new Cat("Reese", LocalDate.of(2017, 4, 20), 40),
                          new Cat("Bordeaux", LocalDate.of(2018, 2, 11), 10));
        List<Cat> kittens = cats.stream.filter(a -> LocalDate.now().parse() - a.parse());
    }
}
