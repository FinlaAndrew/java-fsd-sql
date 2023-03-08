package Project;

public class Customer {
	private int customerid;
	private String curtomername;
	private String email;
	public Customer(int customerid, String curtomername, String email) {
		super();
		this.customerid = customerid;
		this.curtomername = curtomername;
		this.email = email;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCurtomername() {
		return curtomername;
	}
	public void setCurtomername(String curtomername) {
		this.curtomername = curtomername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
