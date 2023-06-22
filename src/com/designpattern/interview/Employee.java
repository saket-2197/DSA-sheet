package com.designpattern.interview;

//step  -1 create class a final so that no one extends it
//step -2 create variable as final so that reassignment is not possible
//step -3 create private parmaterized constructor
//step -4 use only getter method to access the values and not setter methods
// no setter methods are allowd 

public final class Employee {

	private final String name;
	private final String city;
	private final Integer age;
	private final Address address;

	public Employee(String name, String city, Integer age, Address address) {
		this.name = name;
		this.city = city;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Integer getAge() {
		return age;
	}

	public Address getAddress() {
		return new Address(address);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", age=" + age + ", address=" + address + "]";
	}

	

}
