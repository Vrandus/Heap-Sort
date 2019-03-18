import java.util.Arrays;
import java.util.Random;

public class SortTester {

	public static void main(String[] args) {
		int[] N = { 10, 100, 1000, 10000, 100000, 1000000 };
		Random rand = new Random();
		for (int i = 0; i < N.length; i++) {
			int[] randArray = (rand.ints(N[i], 0, N[4] * 10)).toArray();
			int[] quick = randArray.clone();
			int[] heap = randArray.clone();
			long quickBefore = System.currentTimeMillis();
			Arrays.sort(quick);
			long quickAfter = System.currentTimeMillis() - quickBefore;
			long heapBefore = System.currentTimeMillis();
			heapSort.sort(heap);
			long heapAfter = System.currentTimeMillis() - heapBefore;
			System.out.format("N = %d:\n", N[i]);
			System.out.format("QuickSort %15d ms\nHeapSort  %15d ms\n", quickAfter, heapAfter);
		}
	}
}