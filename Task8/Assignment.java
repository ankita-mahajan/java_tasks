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
			int n = 0;
			ArrayList<Integer> first = new ArrayList<Integer>();
			ArrayList<Integer> second = new ArrayList<Integer>();
			ArrayList<Integer> third = new ArrayList<Integer>();
			
			while(scanner.hasNextInt())
			{
				n++;
				if(n == 1 || n == 4 || n == 7){
					first.add(scanner.nextInt());
				}else if(n == 2 || n == 5 || n == 8){
					second.add(scanner.nextInt());
				}else{
					third.add(scanner.nextInt());
				}
			}
			
			long add1=0;
			double add2=0;
			long add3=0;
			
			for(int i = 0;i<first.size(); i++){
				add1 = add1 + first.get(i);
				add2 = add2 + second.get(i);
				add3 = add3 + third.get(i);
			}
			
			System.out.print(add1/3+" "+Math.round(add2/3)+" "+add3/3);
			
			file_open.close();
		}catch(Exception e){
			System.out.print("file name expected");
			System.exit(0);
		}
	}
}