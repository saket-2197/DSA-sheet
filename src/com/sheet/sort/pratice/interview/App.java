package com.sheet.sort.pratice.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class App {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));

		long count = employeeList.stream().count();
		Double sum = employeeList.stream().map(i -> i.getSalary()).reduce(0.0, (a, b) -> a + b);

		System.out.println(sum / count);

		OptionalDouble average = employeeList.stream().map(i -> i.getSalary()).mapToDouble(i -> i.doubleValue())
				.average();
		System.out.println(average.getAsDouble());

		OptionalDouble average2 = employeeList.stream().mapToDouble(i->i.getSalary()).average();
		
		System.out.println(average2);
		
		String s1 = "saket";
		String s2 = "saket";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
