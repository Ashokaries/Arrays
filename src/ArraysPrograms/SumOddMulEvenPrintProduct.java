package ArraysPrograms;

public class SumOddMulEvenPrintProduct {
	public static void main(String[] args)
	{
		int a[]=new int[8];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		int oddsum=0;
		int evenmul=1;
		for(int i=0;i<=7;i++) {
			if(i%2==0) {
				evenmul=evenmul*a[i];
			}
			else {
				oddsum=oddsum+a[i];
			}
		}
		System.out.println("Odd sum is:"+oddsum);
		System.out.println("Even mul is:"+evenmul);
		int pdt=evenmul*oddsum;
		System.out.println("Product of even mul and odd sum is:"+pdt);
	   
		
		
	}
	

}
