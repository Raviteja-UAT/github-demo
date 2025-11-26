package com.java.oopsprograms;

abstract class Employee {
	float sal = 5000.00f;

	abstract void work();

	void getSalary() {
		System.out.println("salary : " + sal);
	}
}

public class HRManager extends Employee {

	@Override
	void work() {
		System.out.println("implementing work method");

	}

	void addEmployee() {
		System.out.println("new employee is added");
	}

	public static void main(String[] args) {

		HRManager h = new HRManager();
		h.work();
		h.getSalary();
		h.addEmployee();
	}

}
