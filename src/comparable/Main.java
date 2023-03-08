package comparable;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(101,"ajay",27));
		al.add(new Student(101,"jay",21));
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		
	}

}
