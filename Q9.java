/*Write a Java program that shows the usage of try, catch, 
throws and finally.*/
import java.util.Scanner;
import java.util.InputMismatchException;

class Q9{

	static int[] getValue() throws InputMismatchException{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number-1:");
		int a = sc.nextInt();
		System.out.print("Enter Number-2:");
		int b = sc.nextInt();
		int value[] = {a,b};
		return value;
	}
	public static void main(String[] args){
		
		try{
			System.out.println("Program to perform Division");
			int value[] = getValue();
			int c = value[0]/value[1];
			System.out.println("Result="+c);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			
			
		}
		catch(InputMismatchException e){
			System.out.println("Invalid integer input");
			
		}
		finally{
			System.out.println("End of Operation");
		}
	}
}
