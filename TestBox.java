import java.util.Scanner;

class Box{
	private float length;
	private float breadth;
	private float height;
	
	Box(){
	 length = breadth = height = 0;
	}
	
	Box(float length,float breadth,float height){
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	void volume(){
		float volume = length*breadth*height;
		System.out.println("volume: "+volume);
	}
	
}
class TestBox{
 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length, breadth, height");
		Box b1 = new Box();
		Box b2 = new Box(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
		System.out.println("default constructor");
		b1.volume();
		System.out.println("parameterised constructor");
		b2.volume();
	}
}
