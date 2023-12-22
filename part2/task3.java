package part2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*4. Append to File:
   - Open the "output.txt" file created in Task 3 in append mode.
   - Add the following lines to the end of the file:
     - "Appending new line."
     - "File I/O without buffers."
*/
		Scanner kb = new Scanner(System.in);
		PrintWriter pw = null;
		String s;
		
		try {
			pw = new PrintWriter(new FileOutputStream("output.txt",true));
			
		}catch(FileNotFoundException e) {
			System.out.println("the file didnt exists");
			System.exit(0);
		}
		
		System.out.println("please enter the message you would like to add");
		s= kb.nextLine();
		pw.println(s);
		
		System.out.println("next input");
		s= kb.nextLine();
		pw.println(s);
	
		
		pw.close();
		kb.close();
	}

	}
