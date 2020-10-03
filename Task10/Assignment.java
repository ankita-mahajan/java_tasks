import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
public class Assignment{

	public static void main(String args[]) throws IOException{
		try{
			FileInputStream file_open = new FileInputStream(args[0]);
			System.out.println("Opening file " + args[0]);
			System.out.println("Opening of file "+ args[0] +" successful");
			Scanner scanner = new Scanner(file_open);
			int numberCols = 0;
			try{
				 numberCols=scanner.nextInt();
			}catch(Exception e){
				System.out.print("integer expected at start of file");
				System.exit(0);
			}
			if(numberCols <= 0){
				System.out.print("number of columns should be equal to or greater than 1");
				System.exit(0);
			}else{
				System.out.print("number of columns ="+numberCols);
			}
			String [][] matrix=new String[10000000][numberCols];

			int rowIndex=0; 
			while(true){
				try{
					rowIndex++;
					String s = scanner.nextLine();
					String[] arrOfStr = s.split("\\s+"); 
					if(arrOfStr.length != numberCols && rowIndex != 1){
						System.out.print("\nline "+rowIndex+" number of columns = "+arrOfStr.length);
					}
				}
				catch(Exception e){
					break;
				}			
				
			
			}
		
			file_open.close();
		
		}catch(Exception e){
			System.out.print("file name expected");
			System.exit(0);
		}
	}
}

// :what happened?
