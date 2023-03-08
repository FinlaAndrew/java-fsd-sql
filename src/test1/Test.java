package test1;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello i am joker. Hello Hello HI hey hi! hi MElcow, melcow";
		String a = s.replaceAll("[!@#$%^&*()0-9,.?:;]","");
		//System.out.println(a);
		String[] r = a.split(" ");
		List<String> f = Arrays.asList(r);
		int w = f.size();
		//System.out.println(f);
		List<String> e = f.stream().map(t->t.toLowerCase()).distinct().sorted().toList();
		int q= e.size();
		System.out.println("Number of wprds : "+w);
		System.out.println("Number of unique words : "+q);
		System.out.println("Unique words are : ");
		//System.out.println(e);
		e.forEach(t->System.out.println(t));
	}

}
