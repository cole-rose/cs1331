import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class Scannerprob {
	public static void main(String[] args) throws Exception{

		System.out.println("Input a file name to read into this program: ");
		Scanner filename = new Scanner(System.in);
		String name = filename.nextLine();
		System.out.println("Reading file now");
		String newFile = name.substring(0, name.lastIndexOf(".") ) + "-uppercaseyoudidit.txt";
		PrintStream outFile = new PrintStream(new File(newFile));

		Scanner fileScanner = new Scanner(new File(name));
		while(fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			outFile.println(line.toUpperCase());
		}
// do something with line
										}


	}
