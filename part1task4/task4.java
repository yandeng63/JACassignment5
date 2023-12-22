package part1task4;

import java.util.ArrayList;

public class task4 {

	public static <T> void printArrayListElements(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.println(element);
        }
}
}
