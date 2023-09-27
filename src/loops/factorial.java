package loops;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int i,n,f=1;
		System.out.println("enter the number whose table you want to print");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);

	}

}
