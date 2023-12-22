package part2;

import java.io.FileWriter;
import java.io.IOException;



public class task4 {

	/*Challenge:
   - Implement a method that takes a filename and a String as input and writes the String to the specified file without using buffers.
   - Test this method by writing a custom message to a new file named "custom.txt."
*/
	
	public static void main(String[] args) {
        String fileName = "custom.txt";

        String message = "Hello";
       
        writeStringToFile(fileName, message);

        System.out.println("message has been written to : " + fileName);
    }
	
	private static void writeStringToFile(String fileName, String input) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
	

	