import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        // Create arrays
        int[] arrAscend = new int[50000];
        int[] arrDescend = new int[50000];
		int[] arrRand = new int[50000];

        // Populate arrays accordingly
        for (int i = 0; i < arrAscend.length; i++) 
            arrAscend[i] = i + 1;
        for (int i = 0; i < arrDescend.length; i++) 
            arrDescend[i] = arrDescend.length - i;
        for (int i = 0; i < arrRand.length; i++) 
            arrRand[i] = rand.nextInt(50000);
        
		// Insertion Sort
		InsertionSort.intInsertionSort(arrRand);
		System.out.println("Insertion Sort: " + Arrays.toString(arrRand));
    }
}
