public class InsertionSort {

    /**
     * Sorts an array using Insertion Sort and tracks comparisons and movements.
     * @param a the array of integers to sort.
     * @param stats an array to store statistics: stats[0] for comparisons, stats[1] for movements.
     */
    public static long[] sort(int[] a) {
        long comparisons = 0;
        long movements = 0;

        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            movements++; // Count saving to temp as one move

            int j;
            // The comparison happens as part of the loop condition
            for (j = i - 1; j >= 0; j--) {
                comparisons++;
                if (temp < a[j]) {
                    a[j + 1] = a[j];
                    movements++; // Count shifting element as one move
                } else {
                    // No need to compare further, element is in position
                    break;
                }
            }
            a[j + 1] = temp;
            movements++; // Count placing temp back as one move
        }

		return new long[]{comparisons, movements};
    }
}