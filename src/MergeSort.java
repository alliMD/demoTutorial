
public class MergeSort {
	
	public static int[] merge(int[] arr, int left, int mid, int right){
		
		int indexLeft = left;  
		int indexRight = mid+1; //left boundary of right portion
		
		int[] tmp = new int[arr.length-1];
		int tmpIndex = left; //for temp array!
		
		while(tmpIndex <= right){
			if(indexRight >right ||  //completed elements on the right side
					(indexLeft <= mid && arr[indexLeft] <= arr[indexRight]) ){
				tmp[tmpIndex] = arr[indexLeft];
				indexLeft++;
			}
			else{
				tmp[tmpIndex] = arr[indexRight];
				indexRight++;
			}
			tmpIndex++;
		}
	     return tmp;
		
	}
	
	public void mergeSort(int[] A, int left, int right){
		
		//if left == right, do nothing (no need any code here even if it's our base case)
		if(left < right){
			int mid = (left + right) /2;
			mergeSort(A, left, mid); //now left mid is sorted
		    mergeSort(A, mid+1, right); //now mid to right is sorted
		    
		    A = merge(A, left, mid, right);
		    
		}
	}

}
