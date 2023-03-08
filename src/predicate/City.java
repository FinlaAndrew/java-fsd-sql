package predicate;

import java.util.Arrays;
import java.util.List;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> city=Arrays.asList("Thrissur","Trivandrum","Kochi","Hyderabad");
		List<String> c =city.stream().filter(t->t.toLowerCase().startsWith("t")).toList();
		System.out.println(c);
	}

}
