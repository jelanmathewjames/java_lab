import java.util.Scanner;

class QuickSort{

	static Scanner sc = new Scanner(System.in);
	static void swap(String[] name, int i, int j){
		String temp = name[j];
		name[j] = name[i];
		name[i] = temp;
	}
	static int partition(String[] name,int left,int right){
		String pivot = name[right];
		int i=left-1;
		for(int j = left;j<=right-1;j++){
			if(name[j].compareTo(pivot)<0){
				i++;
				swap(name,i,j);
				
			}
		}swap(name,i+1,right);
		return (i+1);
	}
	static void quicksort(String[] name, int left, int right){
		if(left<right){
			int pi = partition(name,left,right);
			quicksort(name,pi+1,right);
			quicksort(name,left,pi-1);
		}
	}
	public static void main(String args[]){
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		String[] name = new String[limit];
		System.out.println("Enter names");
		for(int i =0;i<limit;i++)
			name[i] = sc.next();
		quicksort(name,0,limit-1);
		System.out.println("Sorted names");
		for(int i = 0;i<limit;i++)
			System.out.print(name[i]+" ");
		System.out.println();
	}
}

