import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOFiles {

	public static void main(String[] args) throws FileNotFoundException {

		double sum = 0;
		
		File inputFile = new File("numbers.txt");
		
		Scanner in = new Scanner(inputFile);
		
		while (in.hasNextDouble())
		{
			double value = in.nextDouble();
			sum = sum + value;
		}
		
		in.close();
		
		PrintWriter out = new PrintWriter("total.txt");
		
		out.println("Sum: " + sum); // 19700.61‬
		out.close();

		System.out.println("Expected sum to be written: 19700.61");
		
	}//main

}//IOFiles