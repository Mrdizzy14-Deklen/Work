public class QuickSort {

	// Define our parameters and counts
    private int[] array;
    private long comparisons = 0;
    private long movements = 0;

    public long[] sort(int[] inputArr) {

		// Set array
        this.array = inputArr;
        quickSort(0, inputArr.length - 1);

        return new long[]{comparisons, movements};
    }

    private void quickSort(int lowerIndex, int higherIndex) {

		// Define bounds and pivot
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        // Loop through array (n)
        while (i <= j) {

			// Jump between 2 halves (logn)

            while (array[i] < pivot) {
                this.comparisons++;
                i++;
            }
            this.comparisons++; 

            while (array[j] > pivot) {
                this.comparisons++;
                j--;
            }
            this.comparisons++;
            
			// Switch elements
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

		// Recur if needed
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        this.movements += 3;
    }
}