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
		System.out.println("volume: "+length*breadth*height);
	}
	
}

class TestBox{
 
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght, breadth, height");
		Box b = new Box(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
		b.volume();
	}
}
