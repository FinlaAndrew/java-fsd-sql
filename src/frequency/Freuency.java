package frequency;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freuency {
	public static void main(String[] args) {
		List<String> s = Arrays.asList("Finla","Sagar","Meera","Kevin","Eira","Erica","Sagar");
		Map<String,Long> j = s.stream()
				.map(t->t.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(j);
	}
	
}
