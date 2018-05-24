import java.util.*;

public class Collection1 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("String1");
		arr.add(new Integer(1));
		arr.add("String1");
		arr.add(1);
		arr.add("String1");

		arr.remove("String1");
		arr.remove(1);
		System.out.println(arr);
	}
}