package comparable;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student st) {
		if(age==st.age)
			return 0;
		else if(age<st.age)
			return 1;
		else
			return -1;
	}

}
