package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Iteratormain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>listt=new ArrayList<String>();
		listt.add("Finla");
		listt.add("Meera");
		listt.add("Joffin");
		Iterator itr = listt.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		};
}
}