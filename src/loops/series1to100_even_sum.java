package loops;

public class series1to100_even_sum {

	public static void main(String[] args) {
	int i,sum=0;
		
		for(i=0;i<=100;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			sum=sum+i;
		}
		}
      System.out.println(sum);

	}

}
