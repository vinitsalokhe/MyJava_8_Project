package com.demo;

public class Employee {

	int id;
	String name;
	String city;
	int salary;
	String Gender;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String city, int salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		Gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", Gender=" + Gender
				+ "]";
	}

}
