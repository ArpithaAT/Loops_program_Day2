package loops;

import java.util.Scanner;

public class tableprinting {

	public static void main(String[] args) {
		int n,i,t;
		
		System.out.println("enter the number whose table you want to print");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			t=n*i;
			System.out.println(t);
		}
		

	}

}
