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
			int numberCols=scanner.nextInt();

			int [][] matrix=new int[10000000][numberCols];

			int rowIndex=0; 
			while(true){
				try{
						for(int i=0;i<numberCols;i++){
						
							String charEle=scanner.next();
                            int ele=Integer.parseInt(charEle);
                            
						}
						
						rowIndex++;

					//	System.out.println("---Ended--Col--");

				}	
                catch(NumberFormatException e){
                    System.out.println("\nINVALID NUMERIC TYPE INPUT");
                    break;
                }
				catch(Exception e){
                    System.out.println(e);
                  	break;
				}			
				
			
			}
				//printMatrix(matrix,rowIndex);
				//System.out.println("Averages are: ");
				//findColumnWiseAverage(matrix,rowIndex);

			file_open.close();
		}catch(Exception e){
			System.out.print("file name expected");
			System.exit(0);
		}
	}
}