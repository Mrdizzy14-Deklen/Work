
// Quick Sort
public class QuickSort {
	
    private int moves;
    private int comps;
    private double startTime;

	public double[] quickSort(int[] array, int lowerIndex, int higherIndex) {
        this.comps = 0;
        this.moves = 0;
        this.startTime = System.nanoTime();
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
		while (i <= j) {
			while (array[i] < pivot) {
                comps++;
				i++;
			}
			while (array[j] > pivot) {
                comps++;
				j--;
			}
			if (i <= j) {
				exchangeNumbers(array, i, j);
				i++;
				j--;
			}
		}
		if (lowerIndex < j)
			quickSort(array, lowerIndex, j);
		if (i < higherIndex)
			quickSort(array, i, higherIndex);
        return new double[]{comps, moves, (System.nanoTime() - startTime)};
	}
	private void exchangeNumbers(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
        moves++;
		array[j] = temp;
        moves++;
	}
}
