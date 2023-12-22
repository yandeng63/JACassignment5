package part1task1;

import java.util.ArrayList;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("apple");
		wordList.add("banada");
		wordList.add("orange");
		wordList.add("grape");
		wordList.add("kiwi");
		
		System.out.println(wordList);
		
		wordList.add(0,"pear");
		System.out.println(wordList);
		
		wordList.remove(2);
		System.out.println(wordList);
		
		boolean check= wordList.contains("orange");
		System.out.println(check); 
		 
		System.out.println("The updated wordList is :" + wordList);
		
		System.out.println("implement task 4 printArrayListElements method");
		printArrayListElements(wordList);
	}
	
	public static <T> void printArrayListElements(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.println(element);
        }
	
	}
}
