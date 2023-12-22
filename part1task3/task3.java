package part1task3;

import java.util.ArrayList;

import part1task2.Pair;

public class task3 {
	public static void main(String[] args) {

		Pair<Integer, String> p1 = new Pair<>(42, "Hello, World!");
		
		
		 Pair<Double,Double> p2 = new Pair<>(11.1,12.2);
	
	
		ArrayList<Pair<?, ?>> myList = new ArrayList<>();
	
		myList.add(p1);
		myList.add(p2);
	
		System.out.println(myList);
		
		System.out.println("implement task 4 printArrayListElements method");
		printArrayListElements(myList);
		
		
	}
	
	public static <T> void printArrayListElements(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.println(element);
        }
}
}
