import java.util.Scanner;
class HelloWorld{
	static Scanner read = new Scanner(System.in);
	static int C[][];
    public static void main(String args[]){
        System.out.println("Enter row and column for matrix");
        int row = read.nextInt();
        int col = read.nextInt();
        System.out.println("Enter the values for first matrix");
        int A[][] = readMatrix(row,col);
        System.out.println("Enter the values for second matrix");
        int B[][] = readMatrix(row,col);
        addMatrix(A,B,row,col);
        System.out.println("Result:");
        printMatrix(C,row,col);
    }
    static int[][] readMatrix(int rowSize, int colSize){
    	int R[][] = new int[rowSize][colSize];
    	for(int i=0;i<rowSize;i++)
    		for(int j=0;j<colSize;j++)
    			R[i][j] = read.nextInt();
    	return R;
    }
    static void printMatrix(int P[][], int rowSize, int colSize){
    	for(int i=0;i<rowSize;i++){
    		for(int j=0;j<colSize;j++)
    			System.out.print(P[i][j]+" ");
    		System.out.println();}
    }
    static void addMatrix(int F[][],int S[][], int rowSize, int colSize){
    	C = new int[rowSize][colSize];
    	for(int i=0;i<rowSize;i++)
    		for(int j=0;j<colSize;j++)
    			C[i][j] = F[i][j]+S[i][j];
    }
}
