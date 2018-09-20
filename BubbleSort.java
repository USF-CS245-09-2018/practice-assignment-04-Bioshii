public class BubbleSort implements SortingAlgorithm {
	public void sort(int[] arr) {
		// We need to do this as many times as there are values in the array 
		for (int i = 0; i < arr.length-1; i++) {
			// For each value, compare the value immediately to the right of import junit.framework.TestCase;
			// Swap values if the current value is greater than the value to the right of it
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
