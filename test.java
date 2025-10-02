import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        // Create arrays
        int[] arrAscend1 = new int[50000];
        int[] arrAscend2 = new int[50000];
        int[] arrAscend3 = new int[50000];
        int[] arrAscend4 = new int[50000];
        int[] arrDescend1 = new int[50000];
        int[] arrDescend2 = new int[50000];
        int[] arrDescend3 = new int[50000];
        int[] arrDescend4 = new int[50000];
		int[] arrRand1 = new int[50000];
		int[] arrRand2 = new int[50000];
		int[] arrRand3 = new int[50000];
		int[] arrRand4 = new int[50000];

        // Populate arrays accordingly
        for (int i = 0; i < 50000; i++){
            arrAscend1[i] = i + 1;
            arrAscend2[i] = i + 1;
            arrAscend3[i] = i + 1;
            arrAscend4[i] = i + 1;
        }
        for (int i = 0; i < 50000; i++){
            arrDescend1[i] = 50000 - i;
            arrDescend2[i] = 50000 - i;
            arrDescend3[i] = 50000 - i;
            arrDescend4[i] = 50000 - i;
        }
        for (int i = 0; i < 50000; i++){
            int randNum = rand.nextInt(50000);
            arrRand1[i] = randNum;
            arrRand2[i] = randNum;
            arrRand3[i] = randNum;
            arrRand4[i] = randNum;
        }

        QuickSort qs = new QuickSort();

		System.out.println("Ascend Array");
		long[] insertResultsAscend = InsertionSort.intInsertionSort(arrAscend1);
		System.out.println("Insertion Sort: " + insertResultsAscend[1] + " swaps, " + insertResultsAscend[0] + " comparisons");
        long[] quickResultsAscend = qs.quickSort(arrAscend4, 0, 49999);
		System.out.println("Quick Sort: " + quickResultsAscend[1] + " swaps, " + quickResultsAscend[0] + " comparisons");
        long[] selectResultsAscend = SelectionSort.doSelectionSort(arrAscend4);
		System.out.println("Selection Sort: " + selectResultsAscend[1] + " swaps, " + selectResultsAscend[0] + " comparisons");

		System.out.println("Descend Array");
		long[] insertResultsDescend = InsertionSort.intInsertionSort(arrDescend1);
		System.out.println("Insertion Sort: " + insertResultsDescend[1] + " swaps, " + insertResultsDescend[0] + " comparisons");
        long[] selectResultsDescend = SelectionSort.doSelectionSort(arrDescend4);
		System.out.println("Selection Sort: " + selectResultsDescend[1] + " swaps, " + selectResultsDescend[0] + " comparisons");

		System.out.println("Random Array");
		long[] insertResultsRand = InsertionSort.intInsertionSort(arrRand1);
		System.out.println("Insertion Sort: " + insertResultsRand[1] + " swaps, " + insertResultsRand[0] + " comparisons");
        long[] selectResultsRand = SelectionSort.doSelectionSort(arrRand4);
		System.out.println("Selection Sort: " + selectResultsRand[1] + " swaps, " + selectResultsRand[0] + " comparisons");
    }
}
