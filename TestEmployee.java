import java.util.Scanner;
import java.util.ArrayList;
class Employee{

	protected String name;
	protected int age;
	protected long phone_number;
	protected String address;
	protected double salary;
	
	Employee(String name,int age,long phone_number,
						String address,double salary){
		this.name = name;
		this.age = age;
		this.phone_number = phone_number;
		this.address = address;
		this.salary = salary;
	}
	
	void printSalary(){
		System.out.println("salary: "+salary);
	}
	
}

class Officer extends Employee{
	private String specialization;
	private String department;

	Officer(String name,int age,long phone_number,
				String address,double salary,
				String specialization,String department){
				
		super(name,age,phone_number,address,salary);
		this.specialization = specialization;
		this.department = department;
	}
	
	ArrayList<Object> getData(){
		ArrayList<Object> data = new ArrayList<Object>();
		data.add(name);data.add(age);data.add(
		return data;
	}
}

class Manager extends Employee{
	private String specialization;
	private String department;
	
	Manager(String name,int age,long phone_number,
				String address,double salary,
				String specialization,String department){
		super(name,age,phone_number,address,salary);
		this.specialization = specialization;
		this.department = department;
	}
	
	ArrayList<Object> getData(){
		ArrayList<Object> data = new ArrayList<Object>();
		data.add(name);
		return data;
	}
}

class TestEmployee{
	public static void main(String[] args){
		Manager manager = new Manager("j",4,34323,"dsfdf",343.4,"f","j");
		ArrayList<Object> m = manager.getData();
		for(int i=0;i< m.size();i++)
			System.out.println(m.get(i));
	}
}
