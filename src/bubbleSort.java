
public class bubbleSort {
	
	static void bubblesort(int[] array, int n){
		for (int i = 0 ; i<n; i++){ //do the next for loop n times
			for(int j = 0; j<n-1-i; j++){
				if(array[j+1] < array[j]){ //worst case scenario when this is always true
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}//end of if
				
			}
		}//end of two for 
	} //end of bubblesort
	
	public static void main(String[] args){
		int[] myarray = {11,10,9,8,7,6,5,4,3,2,1};
		for(int i = 0; i<myarray.length; i++){
			System.out.print(myarray[i]+" ");
		}
		
		System.out.println("\nsorted array:");
		bubblesort(myarray, myarray.length);
		for(int i = 0; i<myarray.length; i++){
			System.out.print(myarray[i]+" ");
		}
		
	}

}
