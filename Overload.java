import java.util.Scanner;
class MethodOverloading{
	static int sum(int x,int y){
		return x+y;}
	static int sum(double x, double y){
		return (int)(x+y);}
}

public class Overload{
	
	public static void main(String args[]){
		int num1 = MethodOverloading.sum(3,4);
		int num2 = MethodOverloading.sum(2.2,3.4);
		System.out.println(num1);
		System.out.println(num2);
	}
}
