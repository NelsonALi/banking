package business;

public class Customer {
	private String id;
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String lastName;
	private double balance;
	
	public Customer() {
		this.balance = 0.0;
	}
	
	public Customer(String id, String first, String last, double balance) {
		super();
		this.id = id;
		this.firstName = first;
		this.lastName = last;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
