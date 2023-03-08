package product;

import java.util.Arrays;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product("Laptop",202,15000);
		Product p1 = new Product("HeadPhones",203,5000);
		Product p2 = new Product("Mobile",201,20000);
		
		List<Product> f = Arrays.asList(p,p1,p2);
		List<Product> j = f.stream().filter(t->t.getPrice()>10000).toList();
		System.out.println(j);
	}

}
