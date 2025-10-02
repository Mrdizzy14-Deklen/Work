public class SelectionSort {

    // First loop (n) Second loop (n) = O(n^2)

    public static long[] sort(int[] arr) {

        // Define counters
        long comparisons = 0;
        long movements = 0;

		// Loop through the array (n)
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

			// Find minimum (n)
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[index]) {

					// Update minimum index
                    index = j;
                }
            }
            
            // Swap minimum
            if (index != i) {
				int smallerNumber = arr[index];
				arr[index] = arr[i];
				arr[i] = smallerNumber;
				movements += 3;
			}
        }
        
        return new long[]{comparisons, movements};
    }
}