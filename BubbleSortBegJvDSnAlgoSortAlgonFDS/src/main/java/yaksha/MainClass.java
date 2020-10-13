package yaksha;

import java.util.Scanner;

public class MainClass {

	// Driver method to test above
	public static void main(String args[]) {
		int sizeOfArray;
		int array[];
		Scanner scanner = new Scanner(System.in);
		BubbleSortBO ob = new BubbleSortBO();
		System.out.println("Enter size of the Array :");
		sizeOfArray = scanner.nextInt();
		array = new int[sizeOfArray];
		System.out.println("Enter numbers :");
		for (int i = 0; i < sizeOfArray; i++)
			array[i] = scanner.nextInt();
		// Input = 64 34 25 12 22 11 90
		BubbleSort bubbleSort = new BubbleSort(sizeOfArray, array);
		int arrayResult[] = BubbleSortBO.bubbleSort(bubbleSort);
		System.out.println("Sorted array");
		ob.printArray(arrayResult);
		scanner.close();
	}
}
