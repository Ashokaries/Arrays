package ArraysPrograms;

public class RepeatingElementsInArray {

	public static void main(String[] args) {
		int a[]= {100,99,99,97,98,98,100};
		for(int j=0;j<=a.length-1;j++)
		{
			int x=a[j];
			int count=0;
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i]==x)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[j]);
		    }

	}

}
}
