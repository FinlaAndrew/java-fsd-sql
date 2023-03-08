package arraysum;

import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int n,arr[];
		arr=new int[20];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		System.out.println("Enter the elements");
		if(n<1) {
			System.out.println("Invalid Range");
		}
		else {
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr[i+1]+=arr[i];
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		}
		s.close();
	}

}
