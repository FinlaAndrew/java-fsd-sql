package restuarent;

public class Customer {
	private String id;
	private String name,num,email,location;
	public Customer(String id, String name, String num, String email, String location) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
		this.email = email;
		this.location = location;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", num=" + num + ", email=" + email + ", location=" + location
				+ "]";
	}
	
}
