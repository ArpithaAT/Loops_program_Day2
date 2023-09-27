package special_prgm;

import java.util.Scanner;

public class sum_of_square_num {

	public static void main(String[] args) {
		
		int sum=0,r,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r;
		}
		System.out.println("sum of sq=" + sum);
		

	}

	}

