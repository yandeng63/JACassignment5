package part2;

import java.util.Scanner;
import java.io.FileInputStream;
public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		Scanner sc = null;
		
		try {
			sc = new Scanner(new FileInputStream("Info.txt"));
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The file doesn't exist");
			System.exit(0);
		}
		System.out.println("The info that I read : ");
		
		s = sc.nextLine();
		System.out.println(s);
		System.out.println("The character count from this line is : " + CharacterCount(s));
		
		s = sc.nextLine();
		System.out.println(s);
		System.out.println("The character count from this line is : " + CharacterCount(s));
		
		s = sc.nextLine();
		System.out.println(s);
		System.out.println("The character count from this line is : " + CharacterCount(s));
	}
	//. Character Count:
	 //  - Implement a method that takes a String as input and counts the total number of characters (excluding whitespaces).
	  // - Apply this method to each line read from the file and print the character count for each line.

	public static int CharacterCount(String input) {
	int characters = 0;
	for (int i = 0, length = input.length(); i < length; i++) {
	  if (input.charAt(i) != ' ') {
	    characters++;
	  }
	}
	return characters;
	}

}
