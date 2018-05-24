import java.util;


public class Scanner {
	public static void main(String[] args) throws Exception{

		System.out.println("Input a file name to read into this program: ");
		Scanner filename = new Scanner(System.in);
		System.out.println("Reading file now");
		PrintStream outFile = new PrintStream(new File("somefile.txt"));

		Scanner fileScanner = new Scanner(filename);
		while(fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			outFile.println(line.toUpperCase());
		}
// do something with line
										}


	}
