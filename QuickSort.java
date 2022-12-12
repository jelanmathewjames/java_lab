import java.util.Scanner;

class QuickSort{

	static Scanner sc = new Scanner(System.in);
	static void swap(int[] arr, int i, int j){
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	static void readarray(int[] arr, int n){
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
	}
	static void printarray(int[] arr, int n){
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void quicksort(int[] arr, int left, int right){
		if(left<right){
			int pi = partition(arr,left,right);
			quicksort(arr,pi+1,right);
			quicksort(arr,left,pi-1);
		}
	}
	static int partition(int[] arr,int left,int right){
		int pivot = arr[right],i=left-1;
		for(int j = left;j<=right-1;j++){
			if(arr[j]<pivot){
				i++;
				swap(arr,i,j);
				
			}
		}swap(arr,i+1,right);
		return (i+1);
	}
	public static void main(String args[]){
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		int[] arr = new int[limit];
		System.out.println("Enter elements");
		readarray(arr,limit);
		System.out.print("unsorted array :");
		printarray(arr,limit);
		quicksort(arr,0,limit-1);
		System.out.print("sorted array :");
		printarray(arr,limit);
		
	}
}

