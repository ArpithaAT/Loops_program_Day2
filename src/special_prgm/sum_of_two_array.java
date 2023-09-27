package special_prgm;

public class sum_of_two_array {

	public static void main(String[] args) {
		int n=5;
		
		int a[]= {1,3,4,6,4};
		
		int b[]= {2,4,5,6,1};
		
		int c[]=new int[5];
		
		int i;
		
		for(i=0;i<5;i++)
			
		{
			c[i]=a[i]+b[i];
		}
		for(i=0;i<5;i++)
		{
			System.out.print(c[i]+"\t");
		}

	}

}
