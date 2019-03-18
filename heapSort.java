
public class heapSort {
	public static void sort(int[] a) {
		int temp;
		for (int i = a.length/2; i >= 0; i--) {
			siftDown(a, i, a.length-1);
		}
		for(int i = a.length-1; i >= 1; i--) {
			temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			siftDown(a, 0, i-1);
		}
	}
	
	private static void siftDown(int[] a, int root, int bot) {
		int max = root * 2 + 1;
		if(max < bot) {
			int other = max+1;
			max = (a[other] > a[max]) ? other : max;
			
		}
		else {
			if (max > bot) return;
		}
		if(a[root] >= a[max]) return;
		int temp = a[root];
		a[root] = a[max];
		a[max] = temp;
		
		siftDown(a, max, bot);
	}
}
