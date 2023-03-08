package Project;

public class Main {

	public static void main(String[] args) {
		Customer f=new Customer(100,"Finla","finlana@gmail.com");
		Savings s=new Savings(7642,50000,f,1000);
		System.out.println(s.withdraw(40000));
//		if(s.withdraw(60000)) {
			System.out.println(s.getBalance());
//		}else
//		{
//			System.out.println("Out");
//		}
	}

}
