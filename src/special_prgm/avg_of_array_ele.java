package special_prgm;

public class avg_of_array_ele {

	public static void main(String[] args) {

		int a[]= {90,80,70,90,80};
		int i,sum=0,avg=0;
		
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements: "+sum);
		
		avg=sum/5;
		
		System.out.println("avg of element are:" + avg);

	}

}
