public class SelectionSort implements SortingAlgorithm
{
	public void sort(int[] a){
		int min, temp;
		int n = a.length;
		for(int i = 0;  i<n-1; i++){
			min = i;
			for (int j = i+1 ; j<n ; j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}
	}

}