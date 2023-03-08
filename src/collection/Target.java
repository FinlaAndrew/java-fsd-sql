package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		int num,flag = 0;
		// TODO Auto-generated method stub
		ArrayList<Integer>list= new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter some numbers: ");
		for(int i=0;i<5;i++) {
			num=s.nextInt();
			list.add(num);
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				
				if(list.get(i)+list.get(j)==25) {
					flag=1;
				}
			}
		}
		if(flag==1) {
			System.out.println("target found");
		}
		else {
			System.out.println("Invalid");
		}
		}
	}


