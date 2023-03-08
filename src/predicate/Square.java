package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s =Arrays.asList(2,3,4,5,6);
		//List<Integer> e =s.stream().filter(t->t%2==0for)
		List<Integer> power=s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
		System.out.println(power);
	}

}
