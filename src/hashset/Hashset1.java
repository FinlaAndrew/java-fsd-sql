package hashset;
import java.util.*;
public class Hashset1 {
	public static void main(String[]args) {
		HashSet<String>Set=new HashSet();
		Set.add("One");
		Set.add("Two");
		Set.add("Three");
		Set.add("Four");
		Iterator<String>i=Set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
