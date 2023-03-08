package hashset;

import java.util.Scanner;
import java.util.HashSet;
public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner n = new Scanner(System.in);
			HashSet<Integer> lst = new HashSet<Integer>();
			HashSet<Integer> lst2 = new HashSet<Integer>();
		
		System.out.println("Enter set 1 elemnts: ");
		for(int i=0;i<5;i++) {
			num1=n.nextInt();
			lst.add(num1);
		}
		System.out.println("Enter set 2 elemnts: ");
		for(int i=0;i<5;i++) {
			num2=n.nextInt();
			lst2.add(num2);
		}
		lst.retainAll(lst2);
		System.out.println(lst);
	}

}
