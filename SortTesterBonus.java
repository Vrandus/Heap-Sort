import java.util.Arrays;
import java.util.Random;

public class SortTesterBonus {
	public static void main(String[] args) {
		int[] N = { 10, 100, 1000, 10000, 100000, 1000000 };
		int[] sort = {-1, 0,  1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] sort2 = new int[46];
		for (int i = 0; i < sort.length; i++)
			sort2[i] = i;
		long sortBefore = System.nanoTime();
		Arrays.sort(sort);
		long sortAfter = System.nanoTime() - sortBefore;
		
		long sort2Before = System.nanoTime();
		Arrays.sort(sort2);
		long sort2After = System.nanoTime() - sort2Before;
		
		
		System.out.format("N = %d:\n", 17);
		System.out.format("QuickSort %15d ns\n", sortAfter);
		System.out.format("N = %d:\n", 47);
		System.out.format("QuickSort %15d ns\n", sort2After);

//		for (int i = 0; i < N.length; i++) {
//			int[] sortedArray = new int[N[i]];
//			int val = N[i];
//			for(int j = 0; j < N[i]; j++) {
//				sortedArray[j] = val;
//				val--;
//			}
//			int[] quick = sortedArray.clone();
//			int[] heap = sortedArray.clone();
//			long quickBefore = System.nanoTime();
//			Arrays.sort(quick);
//			long quickAfter = System.nanoTime() - quickBefore;
//			long heapBefore = System.nanoTime();
//			heapSort.sort(heap);
//			long heapAfter = System.nanoTime() - heapBefore;
//			System.out.format("N = %d:\n", N[i]);
//			System.out.format("QuickSort %15d ms\nHeapSort  %15d ms\n", quickAfter, heapAfter);
//		}
	}
}
