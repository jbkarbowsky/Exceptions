package excpetions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
			readfile("division.txt");
			}
			catch(DivisionByZero e) {
				System.out.println(e.getMessage());
			}
		}
		
	

public static void readfile(String path) throws DivisionByZero
{
	try(Scanner sc=new Scanner(new File(path))){
		while(sc.hasNextLine()) {
			String linia = sc.nextLine();					
			StringTokenizer st = new StringTokenizer(linia);
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
				try {
					System.out.println(first/second);
				}
				catch(ArithmeticException e) {
					throw new DivisionByZero();
				}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
  }	

}

class DivisionByZero extends Exception{
  	public DivisionByZero() {
  		super("Dzielenie przez zero!");
  	}
}
	
	
	
	
	

