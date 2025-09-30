
// Selection Sort
public class SelectionSort {
	public static double[] doSelectionSort(int[] arr) {
        int comps = 0;
        int moves = 0;
        double startTime = System.nanoTime();
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
                    comps++;
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
            moves++;
			arr[i] = smallerNumber;
            moves++;
		}
        return new double[]{comps, moves, (System.nanoTime() - startTime)};
	}
}
