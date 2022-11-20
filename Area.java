import java.util.Scanner;
class Rectangle{
	float length;
	float breadth;
	Rectangle(float l,float b){
		length = l;
		breadth = b;
	}
	float RectangleArea(){
		return length*breadth;
	}
}

public class Area{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		Rectangle rc = new Rectangle(l,b);
		System.out.println(rc.length);
		System.out.println("Area"+rc.RectangleArea());
	}
}
