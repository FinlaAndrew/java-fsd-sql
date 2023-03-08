package Project;

public abstract class Account {
	protected int accNumber;
	protected double balance;
	protected Customer customerobj;
	public Account(int accNumber, double balance, Customer customerobj) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
		this.customerobj = customerobj;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomerobj() {
		return customerobj;
	}
	public void setCustomerobj(Customer customerobj) {
		this.customerobj = customerobj;
	}
	public abstract boolean withdraw(double amount); 
}
