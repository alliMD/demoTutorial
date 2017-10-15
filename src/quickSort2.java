
public class quickSort2 {
	
	public int partition(int[] A, int start, int stop){
		int pivot = A[stop];
		int leftIndex = start;
		int rightIndex = stop -1;
		while(leftIndex < rightIndex){
			
			while(leftIndex <= rightIndex && pivot >= A[leftIndex]) leftIndex++;
			while(leftIndex <= rightIndex && pivot <= A[rightIndex]) rightIndex--;
			if(leftIndex < rightIndex){
				swap(A, leftIndex, rightIndex);
			}
		}
		
		swap(A,leftIndex, stop);
		return leftIndex;
	}
	public void swap(int[] A, int a, int b){
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	
	public void quicksort(int[] arr, int start, int stop){
		
		//base case: if(start == stop) do nothing
		if(start < stop){
			int pivotPos = partition(arr, start, stop);
			//sort left side
			quicksort(arr, start, pivotPos-1);
			//sort right side
			quicksort(arr, pivotPos+1, stop);
		}
				
	}

}
