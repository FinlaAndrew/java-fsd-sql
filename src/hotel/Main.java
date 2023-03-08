package hotel;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter customer id: ");
		int id;
		id =in.nextInt();
		Hotel c1 = new Hotel(100,"Finla","8136917714","finla@gmail.com","Avittathur");
		Hotel c2 = new Hotel(101,"Meera","9876543211","meera@gmail.com","Pathu");
		Hotel c3 = new Hotel(102,"Anuja","8976543211","anuja@gmail.com","vetturod");
		Hotel c4 = new Hotel(103,"Sagar","7896543211","sagar@gmail.com","Kochi");
		Hotel c5 = new Hotel(104,"Aysha","6789987654","aysha@gmail.com","Kottayam");
		
		List<Hotel> list = Arrays.asList(c1,c2,c3,c4,c5);
		//System.out.println(list);
		
		//int id=100;
		//List<Hotel> lt = list.stream().peek(t->{
		int flag=0;
		for(Hotel h: list) {
			
			if(id==h.getRegid()) {
				//System.out.println(t.getName()+" ",t.getNum()+" ",t.getEmailid()+" ",t.getLocation());
				System.out.println(h);
				flag=1;
				break;
			}
			
		}if(flag==0)
			System.out.println( "Invalid");
	}

}
