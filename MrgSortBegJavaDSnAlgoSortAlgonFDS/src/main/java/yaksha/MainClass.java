package yaksha;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		int i;
		Scanner scanner = new Scanner(System.in);
		int[] array;
		int sizeOfArray;
		System.out.println("Enter size of the Array :");
		sizeOfArray = scanner.nextInt();
		array = new int[sizeOfArray];
		System.out.println("Enter numbers :");
		for (i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		MergeSort ob = new MergeSort();
		Array array1 = new Array(array, 0, array.length - 1);
		int result[] = ob.mergeSort(array1);

		System.out.println("\nSorted array");
		for (i = 0; i < array.length; i++) {
			System.out.println(result[i] + "");
		}
		scanner.close();
	}
}
