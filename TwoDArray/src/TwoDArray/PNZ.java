3.Write a program to check whether a number is negative, positive or zero?

import java.util.*;
class PNZ{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an Integer");
		int num=sc.nextInt();
		if(num>0)
			System.out.println("Positive");
		else if(num<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
}
