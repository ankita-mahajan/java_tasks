import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
public class Assignment{
	public static void main(String args[]) throws IOException{
		try{
			System.out.println("Opening file " + args[0]);
			FileInputStream file_open = new FileInputStream(args[0]);
			System.out.println("Opening of file "+ args[0] +" successful");
			Scanner scanner = new Scanner(file_open);
			long add = 0;
			while(scanner.hasNextInt())
			{
				 add = add + scanner.nextInt();
			}
			System.out.print(add/9);
			file_open.close();
		}catch(Exception e){
			System.out.print("file name expected");
			System.exit(0);
		}
	}
}