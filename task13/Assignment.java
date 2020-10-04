import java.io.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
public class Assignment{
	public static void printMatrix(int arr[][],int rowIndex){
		int rows=rowIndex;
		int cols=arr[0].length;
		System.out.println("Rows "+rows);
		System.out.println("Clumns "+cols);

		for(int i=0;i<rows;i++){
			
			for(int j=0;j<cols;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static void findColumnWiseAverage(int arr[][],int rowIndex){
		System.out.println();
		int rows=rowIndex;
		int cols=arr[0].length;

		for(int j=0;j<cols;j++){
			long  sum=0;
			for(int i=0;i<rowIndex;i++){
				sum+=arr[i][j];
			}
			System.out.print(sum/(long)rows+" ");
		}

	}

	public static void main(String args[]) throws IOException{
		try{
			FileInputStream file_open = new FileInputStream(args[0]);
			System.out.println("Opening file " + args[0]);
			System.out.print("Opening of file "+ args[0] +" successful");
			Scanner scanner = new Scanner(file_open);
			
            String s=scanner.nextLine();

            String[] arrOfStr = s.split("\\s+");

            int cols=arrOfStr.length;


			int [][] matrix=new int[10000000][cols];

			int rowIndex=0; 

            for(int i=0;i<cols;i++){
                int ele=Integer.parseInt(arrOfStr[i]);
                matrix[rowIndex][i]=ele;

            }
            rowIndex++;

            try{

                     while(scanner.hasNextLine()){
                        String str=scanner.nextLine();
                        arrOfStr = str.split("\\s+");
                        cols=arrOfStr.length;
                
                        for(int i=0;i<cols;i++){
                            int ele=Integer.parseInt(arrOfStr[i]);
                            matrix[rowIndex][i]=ele;

                        }
                        rowIndex++;
                        //System.out.println(s);

                        }

            }
            catch(Exception e){
                
            }

			//printMatrix(matrix,rowIndex);
				//System.out.println("Averages are: ");
			findColumnWiseAverage(matrix,rowIndex);

			file_open.close();
		}catch(Exception e){
			System.out.print("file name expected");
			System.exit(0);
		}
	}
}