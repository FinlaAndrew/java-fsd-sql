package cobcom;

public class Collection {
	private String name;
	private String id;
	private double salary;
	public Collection(String name, String id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int sortbysalary implements Comparable<Collection>{
		public int compareTo(Collection c) {
			if(c.getSalary()>50000) {
				salary+=0.1;
			}
			else
				
		}
	}
}
