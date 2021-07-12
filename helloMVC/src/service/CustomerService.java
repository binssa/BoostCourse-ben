package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customers;

	public CustomerService() {
		customers = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001", "ben", "ben@abc.com"));
		addCustomer(new Customer("id002", "bob", "bob@abc.com"));
		addCustomer(new Customer("id003", "cherry", "cherry@abc.com"));
		addCustomer(new Customer("id004", "david", "david@abc.com"));
		addCustomer(new Customer("id005", "jerry", "jerry@abc.com"));
	}
	
	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) {
		if(id != null)
			return customers.get(id.toLowerCase());
		else
			return null;
	}
}
