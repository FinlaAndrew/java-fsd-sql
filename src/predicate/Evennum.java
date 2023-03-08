package predicate;
import java.util.Arrays;
import java.util.List;

public class Evennum {
	public static void main(String[] args) {
		//Predicate<Integers> p=t -> t%2==0;
		//System.out.println(p.test(45));
		List<Integer> s = Arrays.asList(23,45,66,98,97);
		s.stream().filter(t->t%2==0).forEach(t->System.out.println("Even number : "+t));
	}

}