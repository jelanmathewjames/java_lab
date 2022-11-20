/*Write a Java program which creates a class named 'Employee' having the following 
members: Name, Age, Phone number, Address, Salary. It also has a method named 
'print- Salary( )' which prints the salary of the Employee. Two classes 'Officer' 
and 'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes 
have data members 'specialization' and 'department' respectively. Now, assign name,
age, phone number, address and salary to an officer and a manager by making an 
object of both of these classes and print the same.*/

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
		System.out.println("Salary: "+salary);
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
	
	void printData(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone number: "+phone_number);
		System.out.println("Address: "+address);
		printSalary();
		System.out.println("Specialization: "+specialization);
		System.out.println("Department: "+department);
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
	
	void printData(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone number: "+phone_number);
		System.out.println("Address: "+address);
		printSalary();
		System.out.println("Specialization: "+specialization);
		System.out.println("Department: "+department);
	}
	
}

class Q7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details of Officer");
		System.out.println("name, age, phone number, address,");
		System.out.println("salary, specialization, department");
		Officer officer = new Officer(sc.next(),sc.nextInt(),
								sc.nextLong(),sc.next(),sc.nextDouble(),
								sc.next(),sc.next());
		System.out.println("Details");
		officer.printData();
		System.out.println();
		System.out.println("Enter details of Manager");
		System.out.println("name, age, phone number, address,");
		System.out.println("salary, specialization, department");
		Manager manager = new Manager(sc.next(),sc.nextInt(),
								sc.nextLong(),sc.next(),sc.nextDouble(),
								sc.next(),sc.next());
		System.out.println("Details");
		manager.printData();
							
	}
}
