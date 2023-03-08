package hashmap;

import java.util.HashMap;
import java.util.Objects;

public class Employee {
	
	private int id,age;
	private String name,department;
	

	public Employee(int id, int age, String name, String department) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.department = department;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, department, id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(department, other.department) && id == other.id
				&& Objects.equals(name, other.name);
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee> Map = new HashMap<Integer,Employee>();
		Employee e1=new Employee(100,23,"Finla","Support");
		Employee e2=new Employee(101,26,"Joffin","Testing");
		Employee e3=new Employee(100,23,"Fiona","Development");
		
		Map.put(1,e1);
		Map.put(2, e2);
		Map.put(3, e3);
		
		for(Integer k: Map.keySet()) {
			Employee e  = Map.get(k);
			System.out.println(e.hashCode());
		}
		//int hashCode = e1.hashCode();
		//int hashCode1 = e2.hashCode();
		//int hashCode2 = e3.hashCode();
		
		//System.out.println(hashCode);

	}

}
