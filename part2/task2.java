package part2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) throws FileNotFoundException {
		/*Write to File:
   - Create a new text file named "output.txt."
   - Write the following lines to the file:
     - "Hello, this is line 1."
     - "Java File I/O is interesting!"
     - "End of the assignment."
*/
		
		Scanner kb = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new FileOutputStream("output.txt"));
		
		System.out.println("Please input the message");
		String s1 = kb.nextLine();
		pw.println("Your input is : "+s1);
		
		System.out.println("Please input nextline message");
		String s2 = kb.nextLine();
		pw.println("Your input is : "+s2);
		
		System.out.println("Please input nextline message");
		String s3 = kb.nextLine();
		pw.println("Your input is : "+s3);
		
		pw.close();
		kb.close();
	}

}
