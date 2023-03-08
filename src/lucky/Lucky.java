package lucky;
import java.util.Scanner;
public class Lucky {
	public static void main(String[] args) {
		int num,r,flag=0;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a 4 digit number: ");
		num=n.nextInt();
		while(num>0) {
			r=num%10;
			if(r==3||r==6||r==9) {
				flag+=1;
			}
				num=num/10;
			
		}
		if(flag==4)
		{
			System.out.println("Lucky");
		}
		else {
			System.out.println("Not Lucky");
		}
		n.close();
	}

}
