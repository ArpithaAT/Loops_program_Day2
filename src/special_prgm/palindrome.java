package special_prgm;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int n;
		int r;
		int sum=0;
		int t;

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		t=n;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		System.out.println(sum);
		if(sum==t)
		{
			System.out.println("num is palindrome");
		}
		else
		{
			System.out.println("num is not palindrome");
		}

	}

}
