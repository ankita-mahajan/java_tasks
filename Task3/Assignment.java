import java.util.*;
public class Assignment{
	public static void main(String args[]){
		try{
			System.out.println("Opening file " + args[0]);
		}catch(Exception e){
			System.out.print("file name expected");
			System.exit(0);
		}
	}
}