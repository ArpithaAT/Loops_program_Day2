package special_prgm;

import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
		int sum=0,r,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		System.out.println("sum of armstrong=" + sum);
		

	}

}
