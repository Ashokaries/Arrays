package ArraysPrograms;

public class SumOfOddIndex2 {

	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		int sum=0;
		for(int i=0;i<=5;i++) {
			if(i%2!=0) {
			sum=sum+a[i];
			}
			
		}
	System.out.println(sum);

	}

}
