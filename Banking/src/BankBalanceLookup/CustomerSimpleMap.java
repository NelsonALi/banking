package BankBalanceLookup;

import java.util.HashMap;
import java.util.Map;

import business.Customer;
import customTools.*;

public class CustomerSimpleMap implements CustomerLookupService {
	private Map<String, Customer> customers;
	public static double highBar = 3000.0;
	
	public CustomerSimpleMap() {
		customers = new HashMap<String, Customer>();
		addCustomer(new Customer("id001", "Harry", "Hacker", -3456.78));
		addCustomer(new Customer("id002", "Codie", "Coder", 1234.56));
		addCustomer(new Customer("id003", "Polly", "Programmer", 987654.32));		
	}
	
	@Override
	public Customer findCustomer(String id) {
		if (id != null) {
			return customers.get(id.toLowerCase());
		} else {
			return null;
		}
	}
	
	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
}
