public class MergeSort {

    // Split (log n) Merge (n) = O(nlogn)

    // Define our paramaters and counts
    private int[] array;
    private int length;
    private int[] tempMergArr;
    private long comparisons = 0;
    private long movements = 0;

    public long[] sort(int[] inputArr) {

        // Define out array and temp array
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];

        doMergeSort(0, length - 1);
        return new long[]{comparisons, movements};
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        // Check if valid
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Split in half (logn)
            // Sort left side
            doMergeSort(lowerIndex, middle);
            // Sort right side
            doMergeSort(middle + 1, higherIndex);
            // Merge sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        
        // Move to temp array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
            this.movements++;
        }

        // Define bounds
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        
        // Compare and merge (n)
        while (i <= middle && j <= higherIndex) {
            this.comparisons++;
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            this.movements++;
            k++;
        }

        // Move back to main array
        while (i <= middle) {
            array[k] = tempMergArr[i];
            this.movements++;
            k++;
            i++;
        }
    }
}