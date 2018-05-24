import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
public class Test {
    

     // Set<String> b = new HashSet<>();
      
     //    String a ="a";
     //        b.add(a);
     //        b.add("aa");
     //        b.add("ased");
     //        b.containsAll(b);
     //        System.out.println(b.size());
     //        ArrayList<String> e = new ArrayList<>(b);
     //        Set<String> f = new HashSet<>(e);
     //        int x = 1;
     //        int y =2;
     //        try{
     //        throw new Throwable("Brr");
     static void cold() throws Throwable {
        throw new Throwable("Brr");
     }
     static void snow() throws Throwable {
        System.out.println("Snow");
        cold();
        System.out.println("Snowflakes");
     } public static void main(String[] args) throws Throwable {
            try {
                snow();
            } catch (Throwable t) {
                System.out.println(t.getMessage());

            }
            System.out.println("Too cold!");
    }
}