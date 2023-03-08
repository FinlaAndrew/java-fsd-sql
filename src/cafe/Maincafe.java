package cafe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Maincafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food l1 = new Food(01,"Veg meals",80);
		Food l2 = new Food(02,"Fish curry meals",120);
		Food l3 = new Food(03,"Chapathy vegcurry",40);
		Food l4 = new Food(04,"Chapathy chicken curry",120);
		Food l5 = new Food(05,"Veg fried rice",60);
		Food l6 = new Food(06,"Chicken fried rice",150);
		
		List<Food> ls = Arrays.asList(l1,l2,l3,l4,l5,l6);
		ls.forEach(t->System.out.println(t));
		
		Scanner n =  new Scanner(System.in);
		Employee e = new Employee(0,null);
		System.out.println("Enter details: \n\n");
		System.out.println("Enter name: ");
		e.setName(n.next());
		System.out.println("Enter uid: ");
		e.setUid(n.nextInt());
		List<Employee> em = Arrays.asList(e);
		em.forEach(t->System.out.println(t));
		int ans,ch;
		do {
			System.out.println("Food details \n");
			ls.forEach(t->System.out.println(t.getId()+" "+t.getFoodname()+" "+t.getPrice()));
			System.out.println("Enter your choice: ");
			ch = n.nextInt();
			System.out.println("Do you want to continue! 0 for yes 1 for No ");
			ans = n.nextInt();
		}while(ans==0);
		int a = ch;
		List<Food> f = ls.stream().filter(t->t.getId()==a).toList();
		f.forEach(t->System.out.println(t));
		
		
		
		
	}

}
