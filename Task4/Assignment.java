import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
public class Assignment{
	public static void main(String args[]) throws IOException{
		try{
			System.out.println("Opening file " + args[0]);
			FileInputStream file_open = new FileInputStream(args[0]);
			System.out.print("Opening of file "+ args[0] +" successful");
			file_open.close();
		}catch(Exception e){
			System.out.print("file name expected");
			System.exit(0);
		}
	}
}