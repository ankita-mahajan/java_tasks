import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
public class Assignment{
	
	public static void main(String args[]) throws IOException{
		try{
			FileInputStream file_open = new FileInputStream(args[0]);
			System.out.println("Opening file " + args[0]);
			System.out.print("Opening of file "+ args[0] +" successful");
			Scanner scanner = new Scanner(file_open);
			file_open.close();
		}
        catch(FileNotFoundException e){
            System.out.println("cannot found "+args[0]);
        }
        catch(Exception e){
			
			System.exit(0);
		}
	}
}