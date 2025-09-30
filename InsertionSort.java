public class InsertionSort {
	public static double[] intInsertionSort(int[] a) {
		int comps = 0;
		int moves = 0;
        double startTime = System.nanoTime();
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			moves++;
			int j;
			for (j = i - 1; j >= 0 && temp < a[j]; j--){
				comps++;
				a[j + 1] = a[j];
				moves++;
			}
			a[j + 1] = temp;
			moves++;
		}
		return new double[]{comps, moves, (System.nanoTime() - startTime)};
	}
}
