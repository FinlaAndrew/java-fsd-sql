package practiseQ;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = n.nextInt();
		int answer = powerof2(num);
		if(answer ==0)
			System.out.println(num  +" is not a power of 2");
		else
			System.out.println(num +" is power of 2");
	}


public static int powerof2(int num) {
	int flag = 0;
	for(int i=0;i<8;i++) {
		if(Math.pow(2, i)==num) {
			flag = 1;
			break;
		}
		else {
			flag = 0;
		}
	}
	return flag;
}
}
	