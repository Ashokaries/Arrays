package ArraysPrograms;

public class SumOfEvenAndOdd {
  public static void main(String[] args) {
	int a[]= new int[8];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	a[6]=70;
	int evensum=0;
	int oddsum=0;
	for(int i=0;i<=7;i++)
	{
		if(i%2==0)
		{
			evensum=evensum+a[i];
		
		}
		else {
		    oddsum=oddsum+a[i];
		}
		
	}
	System.out.println("Even sum is:"+evensum);
	System.out.println("Odd sum is:"+oddsum);
}

}
