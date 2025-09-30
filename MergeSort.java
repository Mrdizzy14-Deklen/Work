
// Merge Sort
public class MergeSort {
    private int[] array;
    private int[] tempMergArr;
    private int length;
    private int comps;
	private int moves;
    private double startTime;

    public double[] sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        this.comps = 0;
        this.moves = 0;
        this.comps = 0;
        this.startTime = System.nanoTime();
        doMergeSort(0, length - 1);
        return new double[]{comps, moves, (System.nanoTime() - startTime)};
    }

	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
            comps++;
			int middle = lowerIndex + (lowerIndex + higherIndex) / 2;
			doMergeSort(lowerIndex, middle);
			doMergeSort(middle + 1, higherIndex);
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i < higherIndex; i++)
			tempMergArr[i] = array[i];
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                comps++;
                array[k] = tempMergArr[i];
                moves++;
                i++;
            } else {
                array[k] = tempMergArr[j];
                moves++;
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            moves++;
            k++;
            i++;
        }
	}
}