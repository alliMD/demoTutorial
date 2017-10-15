
public class quicksort {
	
	public void quickSort(int[] array, int start, int stop){
		if(start < stop){
			int pivot = partition(array, start, stop);
			quickSort(array, start, pivot-1);
			quickSort(array, pivot+1, stop);
		}
	}
	
	public static int partition(int[] array, int start, int stop){
		int pivot;
		int left = start;
		int right = stop-1;
	
		pivot = array[stop];
		
		while(left < right && array[left] < pivot)left++;
		while(left <= right && array[right] >= pivot) right--;
		if(left<right){
			swap(array, left, right);
		}
		swap(array, stop, left);
		return left;
	}
	public static void swap(int[] array, int left, int right){
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}


}
