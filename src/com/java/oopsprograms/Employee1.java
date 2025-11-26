package com.java.oopsprograms;

public class Employee1 {

	
	int id = 101;
	static String name = "raviteja";
	
	void displayId()
	{
		System.out.println("ID : " + id);
	}
	
	static String displayName() {
		return name;
	}
	
	
	
	public static void main(String[] args) {
		
		Employee1 emp = new Employee1();
		emp.displayId();
		String name = displayName();
		System.out.println(name);
		
		
	}

}
