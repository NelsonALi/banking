package customTools;

import business.Customer;

public interface CustomerLookupService {
	
	public Customer findCustomer(String id);

}