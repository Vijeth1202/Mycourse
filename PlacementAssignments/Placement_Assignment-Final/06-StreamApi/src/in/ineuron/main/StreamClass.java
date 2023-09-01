package in.ineuron.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
	public static void main(String[] args) {

		// create a list of customers with their details
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Sahil", 25, "M", "IND", 18000));
		customers.add(new Customer("Balam", 32, "F", "UK", 60000));
		customers.add(new Customer("Rohit", 45, "M", "AUS", 150000));

		// filter the customers by age and gender
		List<Customer> targetCustomers = customers.stream().filter(c -> c.getAge() >= 30 && c.getAge() <= 50)
				.filter(c -> c.getGender().equals("F")).collect(Collectors.toList());

		// sort the customers by income in descending order
		List<Customer> sortedCustomers = targetCustomers.stream()
				.sorted(Comparator.comparingInt(Customer::getIncome).reversed()).collect(Collectors.toList());

		 // print the results
        System.out.println("Target customers: " + targetCustomers);
        System.out.println("Sorted customers: " + sortedCustomers);
	}
}

class Customer {
	private String name;
	private int age;
	private String gender;
	private String country;
	private int income;

	public Customer(String name, int age, String gender, String country, int income) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.country = country;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getCountry() {
		return country;
	}

	public int getIncome() {
		return income;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", gender=" + gender + ", country=" + country + ", income="
				+ income + "]";
	}
	
}
