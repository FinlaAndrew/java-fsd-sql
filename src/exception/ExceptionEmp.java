package exception;

public class ExceptionEmp {

	private String phoneno;
	private String emailid;
	private String address;
	private int empid;
	private String empname;
	private String location;
	private double salary;
	public ExceptionEmp(String phoneno, String emailid, String address, int empid, String empname, String location,
			double salary) {
		super();
		this.phoneno = phoneno;
		this.emailid = emailid;
		this.address = address;
		this.empid = empid;
		this.empname = empname;
		this.location = location;
		this.salary = salary;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ExceptionEmp [phoneno=" + phoneno + ", emailid=" + emailid + ", address=" + address + ", empid=" + empid
				+ ", empname=" + empname + ", location=" + location + ", salary=" + salary + "]";
	}
	
}
