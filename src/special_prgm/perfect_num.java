package special_prgm;

import java.util.Scanner;

public class perfect_num {

	public static void main(String[] args) {
		int n,t,i=1;
		int sum=0;
	    
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		t=n;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==t)
		{
			System.out.println("num is perfect");		
		}
		else
		{
			System.out.println("num is not perfect");
		}

	}

}
