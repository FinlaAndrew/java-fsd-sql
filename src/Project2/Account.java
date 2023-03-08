package Project2;

public class Account {
	private String accnum;
	private String cusname;
	private double balance;
	public Account(String accnum, String cusname, double balance) {
		super();
		this.accnum = accnum;
		this.cusname = cusname;
		this.balance = balance;
	}
	public String getAccname() {
		return accnum;
	}
	public void setAccname(String accname) {
		this.accnum = accname;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
