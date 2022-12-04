import java.util.Scanner;
class MatrixMultiplication{
	static Scanner read = new Scanner(System.in);
    static int C[][];
    static int[][] readMatrix(int rowSize, int colSize){
    	int R[][] = new int[rowSize][colSize];
		for(int i=0; i<rowSize; i++){
        	for(int j=0; j<colSize; j++)
            	R[i][j] = read.nextInt();
            	System.out.println();
    	}
    	return R;
	}
    static void printMatrix(int P[][], int rowSize, int colSize){
    	for(int i=0; i<rowSize; i++){
        	for(int j=0; j<colSize; j++)
            	System.out.print(P[i][j]+" ");
    	System.out.println();
    	}
	}
    static int multiplyMatrix(int frow, int fcol, int F[][], int srow, int scol, int S[][]){
    	int i,j,k;
        C = new int[frow][scol];
        if(fcol != srow){
            System.out.println("Not possible");
    		return 0;
    	}
    	for(i=0; i<frow; i++){
        	for(j=0; j<scol; j++){
            	C[i][j] = 0;
             	for(k=0; k<srow; k++)
                    C[i][j] += F[i][k]*S[k][j];
			}
    	}
    	return 1;
	}
    public static void main(String[] args){
    	System.out.print("Enter row and column for first matrix");
        int row1 = read.nextInt();
        int col1 = read.nextInt();
        System.out.print("Enter row and column for second matrix");
        int row2 = read.nextInt();
        int col2 = read.nextInt();
        System.out.print("Enter the values for first matrix");
        int A[][] = readMatrix(row1,col1);
    	System.out.print("Enter the values for second matrix");
    	int B[][] = readMatrix(row2,col2);
        System.out.println("First Matrix: ");
        printMatrix(A,row1,col1);
        System.out.println("Second Matrix: ");
        printMatrix(B,row2,col2);
        int check = multiplyMatrix(row1,col1,A,row2,col2,B);
        if(check == 1){
            System.out.println("Result :");
    		printMatrix(C,row1,col2);
    	}
	}
}

