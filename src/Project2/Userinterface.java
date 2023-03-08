package Project2;
import java.util.Scanner;
public class Userinterface {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("1.Savings Account\n2.Current Account\nEnter your choice: ");
		int choice,balance;
		float year;
		String accnum;
		String Cname;
		choice = n.nextInt();
		System.out.println("Enter the Account number: ");
		accnum = n.next();
		System.out.println("Enter the Customer name: ");
		Cname = n.next();
		System.out.println("Enter the number of years: ");
		year = n.nextFloat();
		System.out.println("Enter the balance: ");
		balance= n.nextInt();
		
		Account a = new Account(accnum,Cname,balance);
		Savingsaccount s = new Savingsaccount(accnum,Cname,balance);
		Currentaccount c = new Currentaccount(accnum,Cname,balance);
		
		System.out.println("Customer Name :"+" "+a.getCusname());
		System.out.println("Account Name :"+" "+a.getAccname());
		System.out.println("Balance :"+" "+a.getBalance());
		
		if(choice==1) {
			System.out.println(s.calculateMaintenanceCharge(year));
			
		}
		else if(choice==2) {
			System.out.println(c.calculateMaintenanceCharge(year));
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
