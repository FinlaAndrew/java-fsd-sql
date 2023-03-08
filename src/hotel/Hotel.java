package hotel;

public class Hotel {
	private int regid;
	private  String name;
	private String num;
	private String emailid;
	private String location;
	public Hotel(int regid, String name, String num, String emailid, String location) {
		super();
		this.regid = regid;
		this.name = name;
		this.num = num;
		this.emailid = emailid;
		this.location = location;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Hotel [regid=" + regid + ", name=" + name + ", num=" + num + ", emailid=" + emailid + ", location="
				+ location + "]";
	}
	

}
