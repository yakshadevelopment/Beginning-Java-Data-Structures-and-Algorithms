package yaksha;

public class MergeSort {

	void merge(Array array5) {
		int arr[] = array5.getArray();
		int beg = array5.getBeg();
		int mid = array5.getMid();
		int end = array5.getEnd();
		int l = mid - beg + 1;
		int r = end - mid;
		int LeftArray[] = new int[l];
		int RightArray[] = new int[r];
		for (int i = 0; i < l; ++i)
			LeftArray[i] = arr[beg + i];

		for (int j = 0; j < r; ++j)
			RightArray[j] = arr[mid + 1 + j];
		int i = 0, j = 0;
		int k = beg;
		while (i < l && j < r) {
			if (LeftArray[i] <= RightArray[j]) {
				arr[k] = LeftArray[i];
				i++;
			} else {
				arr[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < l) {
			arr[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < r) {
			arr[k] = RightArray[j];
			j++;
			k++;
		}
	}

	int[] mergeSort(Array array1) {
		int array[] = array1.getArray();
		int beg = array1.getBeg();
		int end = array1.getEnd();
		if (beg < end) {
			int mid = (beg + end) / 2;
			Array array2 = new Array(array, beg, mid);
			mergeSort(array2);
			Array array3 = new Array(array, mid + 1, end);
			mergeSort(array3);
			Array array4 = new Array(array, beg, mid, end);
			merge(array4);
		}
		return array;
	}
}