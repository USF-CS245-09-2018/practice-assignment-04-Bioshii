public class SelectionSort implements SortingAlgorithm {

	public int find_min_iterative (int[] arr, int startHere) {
		// Whenever we start this, we want to start with the part of the array that is unsorted, since we are sorting 1 by 1
		int minIndex = startHere;
		// Iterate through the array, comparing each value to current min value. Replace if current index value is less than minIndex value
		for (int currentIndex = minIndex + 1; currentIndex < arr.length; currentIndex++) {
			if (arr[currentIndex] < arr[minIndex]) {
				minIndex = currentIndex;
			}
		}

		return minIndex;
	}

	public void sort(int[] arr) {
		// This is simply where we start
		int startHere = 0;
		// We need to loop through the array as many times as there are items
		for (int i = 0; i < arr.length; i++) {
			int switchThis = find_min_iterative(arr, startHere++);
			int temp = arr[i];
			// Put next minimum value in i position
			arr[i] = arr[switchThis];
			// Swap that value with the position last i was in
			arr[switchThis] = temp;
		}
	}
}
