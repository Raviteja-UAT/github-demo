package com.java.excelrjava;

class Employee {
	int id;
	String name;
	float sal;
	
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.id = 101;
		emp.name = "John";
		emp.sal = 55000.00f;
		
		
		emp.display();
		
	}

}
