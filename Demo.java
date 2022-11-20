
/*class OuterClass{
	class InnerClass{
		InnerClass(){
			System.out.println("Innerclass");
		}
	}
}
public class Demo{
	public static void main(String args[]){
		//if inner class is static we dont need to create outer class object
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
	}
}

class Base{
	Base(int a,int b){
		System.out.println(a+b);
	}
}

class Sub extends Base{
	Sub(){
		super(1,2);
		System.out.println("sub");
	}
}

class Demo{
	public static void main(String args[]){
		Sub s = new Sub();
	}
}*/
/*class Demo{
  int i = 10;
  void m(Demo obj){
  System.out.println("method is invoked");
  }
  void p(){
  System.out.println(this.i);
  m(this);
  }
  
  public static void main(String args[]){
  Demo s1 = new Demo();
  s1.p();
  }
}*/

// Java program to create an ArrayList with
// Multiple Object Types in Java

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args)
	{

		// Creating an ArrayList of Object type
		ArrayList<Object> arr = new ArrayList<Object>();

		// Inserting String value in arr
		arr.add("GeeksForGeeks");

		// Inserting Integer value in arr
		arr.add(14);

		// Inserting Long value in arr
		arr.add(1800L);

		// Inserting Double value in arr
		arr.add(6.0D);

		// Inserting Float value in arr
		arr.add(1.99F);

		// arr after all insertions: ["GeeksForGeeks", 14,
		// 1800L, 6.0D, 1.99F]

		System.out.print(
			"ArrayList after all insertions: ");
		display(arr);

		// Replacing element at index 0 (i.e. an String)
		// with an Integer type value 50
		arr.set(0, 50);

		// Replacing element at index 1 (Integer value)
		// with a Double type value
		arr.set(1, 10.0D);

		// arr after modifications: [50, 10.0D,
		// 1800L, 6.0D, 1.99F]

		System.out.print("ArrayList after modifications: ");

		display(arr);
	}

	// Function to display elements of the ArrayList
	public static void display(ArrayList<Object> arr)
	{
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}
}


