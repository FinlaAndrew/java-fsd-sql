package restuarent;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Maincus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int min,max;
		System.out.println("Enter the min value: ");
		min = in.nextInt();
		System.out.println("Enter the max value: ");
		max = in.nextInt();
		
		Minmax m1 = new Minmax("Zam zam","Kulathoor",2500,1);
		Minmax m2 = new Minmax("Broco","TVM",5000,2);
		Minmax m3 = new Minmax("Sasi Hotel","LAkoor",500,3);
		Minmax m4 = new Minmax("Morgans","Kzk",12500,4);
		Minmax m5 = new Minmax("Amigoos","Palayam",3000,5);
		
		
		List<Minmax> lst=Arrays.asList(m1,m2,m3,m4,m5);
		List<Minmax> ls = lst.stream().filter(t->(t.getBudget()>=min)&&(t.getBudget()<=max)).toList();
		ls.forEach(t->System.out.println(t));
		
		
		System.out.println("\n Choose hotel id: ");
			int m = in.nextInt();
			
		List<Minmax> l=ls.stream().filter(t->t.getId()==m).toList();
		System.out.println(l);
		
		
		System.out.println("REGISTRATION FORM\n\n");
		System.out.println("Enter name: ");
		String nme = in.next();
		System.out.println("Enter Id: ");
		String id = in.next();
		System.out.println("Enter emailid: ");
		String eid = in.next();
		System.out.println("enter location: ");
		String loc = in.next();
		
		l.forEach(t->System.out.println(t.getHotelname()+"\n"+t.getLocation()+"\n"+t.getBudget()+"\n"));
	}

}
