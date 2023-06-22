package com.designpattern.interview;

public class App {

	public static void main(String[] args) {
		
		Address homeAddress = new Address();  
		homeAddress.setCity("pune");
		homeAddress.setState("maharahstra");
		
		Employee employee = new Employee("saket","pune",34,homeAddress);
		
		System.out.println(employee);

		Address address = employee.getAddress();
		address.setCity("blr");
		address.setState("karnataka");
		
		System.out.println(employee);
		
	}
}
