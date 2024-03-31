package ArraysPrograms;

import java.util.Scanner;

public class SumOfEvenIndex {
	public static void main(String[] args) {
		int a[]=new int[8];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		int sum=0;
		for(int i=0;i<=7;i++) {
			if(i%2==0) {
                   sum=sum+a[i];

			}
		}
		System.out.println(sum);
	
		
	}

}
