package ArraysPrograms;

public class FrequencyOfNumInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 5, 5, 5, 5, 5 };
		int x = 7;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				count++;
			} 	
		}
		System.out.println("frequency of 5 is occured :" + count + "times");

	}

}
