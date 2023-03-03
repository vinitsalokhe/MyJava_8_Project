package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();

		l.add(new Employee(12, "Shahaji", "Kolhapur", 100000, "Male"));
		l.add(new Employee(2, "Shantabai", "Mumbai", 9000, "Female"));
		l.add(new Employee(192, "Ram", "Kolhapur", 120000, "Male"));
		l.add(new Employee(1622, "Tatya", "Karad", 1550000, "Male"));
		l.add(new Employee(312, "Tokiyo", "Kolhapur", 10000, "Female"));
		l.add(new Employee(87, "Rajaram", "Satara", 550000, "Male"));
		l.add(new Employee(92, "Hajam", "Karad", 120000, "Male"));
		l.add(new Employee(100, "Bhiku Mahatre", "Kolhapur", 100000, "Male"));
		l.add(new Employee(07, "Priya", "Pune", 5000, "Female"));

//Max salary
		System.out.println("--------------------Max salary----------------");
		Optional<Employee> maxSalary = l.stream()
				.collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
		System.out.println(maxSalary);
		System.out.println();

//2 nd max salary
		System.out.println("--------------------2 nd max salary----------------");
		Optional<Employee> secondMaxSalary = l.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.skip(1).findFirst();
		System.out.println(secondMaxSalary);
		System.out.println();

//get city
		System.out.println("--------------------get city----------------");
		String pCity = "Kolhapur";
		List<Employee> getCity = l.stream().filter(i -> i.getCity().equals(pCity)).collect(Collectors.toList());
		System.out.println(getCity);
		System.out.println();

//Max salary in pirticular city
		System.out.println("--------------------Max salary in pirticular city----------------");
		String pCity1 = "Kolhapur";
		Optional<Employee> maxSalaryInPirticularCity = l.stream().filter(i -> i.getCity().equals(pCity1))
				.max(Comparator.comparingInt(Employee::getSalary));
		System.out.println(maxSalaryInPirticularCity);
		System.out.println();

//pirticular city 2 nd Max salary
		System.out.println("--------------------pirticular city 2 nd Max salary----------------");
		String pCity2 = "Kolhapur";
		Optional<Employee> secondMaxSalaryInPirticularCity = l.stream().filter(i -> i.getCity().equals(pCity2))
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(secondMaxSalaryInPirticularCity);
		System.out.println();

//only male
		System.out.println("--------------------only male----------------");
		String pMale = "Male";
		List<Employee> onlyMale = l.stream().filter(i -> i.getGender().equals(pMale)).collect(Collectors.toList());
		System.out.println(onlyMale);
		System.out.println();

//salary wise sort employee
		System.out.println("--------------------salary wise sort employee----------------");
		List<Employee> salaryWiseSortEmployee = l.stream().sorted(Comparator.comparingInt(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(salaryWiseSortEmployee);
		System.out.println();

//sort name wise
		System.out.println("--------------------sort name wise----------------");
		List<Employee> nameWiseSortEmployee = l.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(nameWiseSortEmployee);
		System.out.println();

//Id wise sort
		System.out.println("--------------------Id wise sort----------------");
		List<Employee> idWiseSortEmployee = l.stream().sorted(Comparator.comparingInt(Employee::getId))
				.collect(Collectors.toList());
		System.out.println(idWiseSortEmployee);
		System.out.println();

//pirticular name using contains & equalsIgnoreCase methods
		System.out.println(
				"--------------------pirticular name using contains & equalsIgnoreCase methods----------------");
		List<Employee> containNameEmp = l.stream().filter(i -> i.getName().contentEquals("Priya"))
				.collect(Collectors.toList());
		System.out.println(containNameEmp);
		System.out.println();
		List<Employee> equalIngnorCaseNameEmp = l.stream().filter(i -> i.getName().equalsIgnoreCase("Priya"))
				.collect(Collectors.toList());
		System.out.println(equalIngnorCaseNameEmp);
		System.out.println();

//to get id is greter than 50
		System.out.println("--------------------to get id is greter than 50----------------");
		List<Employee> idGreterThan = l.stream().filter(i -> i.getId() > 50).collect(Collectors.toList());
		System.out.println(idGreterThan);
		System.out.println();

//only to get a data
		System.out.println("--------------------only to get a data----------------");
		List<Employee> toGetData = l.stream().collect(Collectors.toList());
		System.out.println(toGetData);
		System.out.println();

//pirticular city salary is greter than
		System.out.println("--------------------pirticular city salary is greter than----------------");
		List<Employee> pirticularCitySalaryIsGreterThan = l.stream().filter(i -> i.getCity().contains("Kolhapur"))
				.filter(i -> i.getSalary() > 100000).collect(Collectors.toList());
		System.out.println(pirticularCitySalaryIsGreterThan);
		System.out.println();

//increase salary which id >=100
		System.out.println("--------------------increase salary which id >=100----------------");
		List<Double> model = l.stream().filter(i -> i.getId() >= 100).map(s -> s.getSalary() * 1.10)
				.collect(Collectors.toList());
		System.out.println(model);

	}
}
