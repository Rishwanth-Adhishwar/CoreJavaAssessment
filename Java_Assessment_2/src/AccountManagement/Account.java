package AccountManagement;

//Account class
class Account {

	// private fields
	private int id;
	private Customer customer;
	private double balance = 0.0;

	private String customerName;

	// Parameterized constructor
	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	// Parameterized constructor - constructor overloading
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", customer=" + customer + ", balance=%.2f" + balance + "]";
	}

	public void setCustomerName(String name) {
		customerName = name;
	}

	public String getCustomerName() {
		return customerName;
	}

	// Deposit method for Add Amount
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Amount Deposited Successfully!!");

	}

	// Withdraw method for removing amount
	public void withDraw(double amount) {
		if (balance >= amount) {
			this.balance -= amount;
		} else {
			System.out.println("Amount withdrawn exceeds the current balance!");
		}
	}

}
