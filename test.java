import java.util.Random;

public class test {
    public static void main(String[] args) {

        // Create randomizer
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

        // Create sorting objects
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        // Random Sort Test
        double sInsertRand = System.currentTimeMillis()/1000.0;
        long[] insertResultsRand = InsertionSort.sort(arrRand1);
        double fInsertRand = System.currentTimeMillis()/1000.0;

        double sMergeRand = System.currentTimeMillis()/1000.0;
        long[] mergeResultsRand = mergeSort.sort(arrRand2);
        double fMergeRand = System.currentTimeMillis()/1000.0;

        double sQuickRand = System.currentTimeMillis()/1000.0;
        long[] quickResultsRand = quickSort.sort(arrRand3);
        double fQuickRand = System.currentTimeMillis()/1000.0;

        double sSelectRand = System.currentTimeMillis()/1000.0;
        long[] selectResultsRand = SelectionSort.sort(arrRand4);
        double fSelectRand = System.currentTimeMillis()/1000.0;

        System.out.println("Insertion Sort Random: Time (Seconds): " + (fInsertRand - sInsertRand) + " Comparisons: " + insertResultsRand[0] + " Movements: " + insertResultsRand[1]);
        System.out.println("Merge Sort Random: Time (Seconds): " + (fMergeRand - sMergeRand) + " Comparisons: " + mergeResultsRand[0] + " Movements: " + mergeResultsRand[1]);
        System.out.println("Quick Sort Random: Time (Seconds): " + (fQuickRand - sQuickRand) + " Comparisons: " + quickResultsRand[0] + " Movements: " + quickResultsRand[1]);
        System.out.println("Selection Sort Random: Time (Seconds): " + (fSelectRand - sSelectRand) + " Comparisons: " + selectResultsRand[0] + " Movements: " + selectResultsRand[1]);
        System.out.println();

        // Ascending Sort Test
        double sInsertAscend = System.currentTimeMillis()/1000.0;
        long[] insertResultsAscend = InsertionSort.sort(arrAscend1);
        double fInsertAscend = System.currentTimeMillis()/1000.0;

        double sMergeAscend = System.currentTimeMillis()/1000.0;
        long[] mergeResultsAscend = mergeSort.sort(arrAscend2);
        double fMergeAscend = System.currentTimeMillis()/1000.0;

        double sQuickAscend = System.currentTimeMillis()/1000.0;
        long[] quickResultsAscend = quickSort.sort(arrAscend3);
        double fQuickAscend = System.currentTimeMillis()/1000.0;

        double sSelectAscend = System.currentTimeMillis()/1000.0;
        long[] selectResultsAscend = SelectionSort.sort(arrAscend4);
        double fSelectAscend = System.currentTimeMillis()/1000.0;

        System.out.println("Insertion Sort Ascending: Time (Seconds): " + (fInsertAscend - sInsertAscend) + " Comparisons: " + insertResultsAscend[0] + " Movements: " + insertResultsAscend[1]);
        System.out.println("Merge Sort Ascending: Time (Seconds): " + (fMergeAscend - sMergeAscend) + " Comparisons: " + mergeResultsAscend[0] + " Movements: " + mergeResultsAscend[1]);
        System.out.println("Quick Sort Ascending: Time (Seconds): " + (fQuickAscend - sQuickAscend) + " Comparisons: " + quickResultsAscend[0] + " Movements: " + quickResultsAscend[1]);
        System.out.println("Selection Sort Ascending: Time (Seconds): " + (fSelectAscend - sSelectAscend) + " Comparisons: " + selectResultsAscend[0] + " Movements: " + selectResultsAscend[1]);
        System.out.println();

        // Descending Sort Test
        double sInsertDescend = System.currentTimeMillis()/1000.0;
        long[] insertResultsDescend = InsertionSort.sort(arrDescend1);
        double fInsertDescend = System.currentTimeMillis()/1000.0;

        double sMergeDescend = System.currentTimeMillis()/1000.0;
        long[] mergeResultsDescend = mergeSort.sort(arrDescend2);
        double fMergeDescend = System.currentTimeMillis()/1000.0;

        double sQuickDescend = System.currentTimeMillis()/1000.0;
        long[] quickResultsDescend = quickSort.sort(arrDescend3);
        double fQuickDescend = System.currentTimeMillis()/1000.0;

        double sSelectDescend = System.currentTimeMillis()/1000.0;
        long[] selectResultsDescend = SelectionSort.sort(arrDescend4);
        double fSelectDescend = System.currentTimeMillis()/1000.0;

        System.out.println("Insertion Sort Descending: Time (Seconds): " + (fInsertDescend - sInsertDescend) + " Comparisons: " + insertResultsDescend[0] + " Movements: " + insertResultsDescend[1]);
        System.out.println("Merge Sort Descending: Time (Seconds): " + (fMergeDescend - sMergeDescend) + " Comparisons: " + mergeResultsDescend[0] + " Movements: " + mergeResultsDescend[1]);
        System.out.println("Quick Sort Descending: Time (Seconds): " + (fQuickDescend - sQuickDescend) + " Comparisons: " + quickResultsDescend[0] + " Movements: " + quickResultsDescend[1]);
        System.out.println("Selection Sort Descending: Time (Seconds): " + (fSelectDescend - sSelectDescend) + " Comparisons: " + selectResultsDescend[0] + " Movements: " + selectResultsDescend[1]);
    
    }
}