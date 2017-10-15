
public class run {
	public static void main(String[] str){
		
		quicksort quicksort = new quicksort();
		
		int[] arr = {6,4,2,3,7,1};
		for(int i = 0; i<arr.length; i++){
			System.out.print(" "+arr[i]);
		}
		quicksort.quickSort(arr, 0, arr.length-1);
		System.out.print("\nafter quicksort\n");
		for(int i = 0; i<arr.length; i++){
			System.out.print(" "+arr[i]);
		}
		System.out.print("\n\n");
		
		int[] arr2 = {6,4,2,3,7,1};
		for(int i = 0; i<arr2.length; i++){
			System.out.print(" "+arr2[i]);
		}
		MergeSort mergeSort = new MergeSort();
		
		mergeSort.mergeSort(arr2, 0, 5);
		
		System.out.print("\nafter mergesort\n");
		for(int i = 0; i<arr2.length; i++){
			System.out.print(" "+arr2[i]);
		}
	}
}
