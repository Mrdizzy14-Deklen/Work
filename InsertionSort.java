public class InsertionSort {

    // First loop (n) Second loop (n) = O(n^2)

    public static long[] sort(int[] a) {

        // Define counters
        long comps = 0;
        long moves = 0;

        // Loop through the array (n)
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            moves++;

            int j;
            // Loop through the array for each element (n)
            for (j = i - 1; j >= 0; j--) {
                comps++;

                // Move element to correct position
                if (temp < a[j]) {
                    a[j + 1] = a[j];
                    moves++;
                } else {
                    // Element in position
                    break;
                }
            }
            // Replace element
            a[j + 1] = temp;
            moves++;
        }

		return new long[]{comps, moves};
    }
}