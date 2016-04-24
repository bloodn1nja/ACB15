package newPackage;

import java.util.Arrays;

public class ArraysNew {
	public static void main(String[] args) {
		double[] payArray = new double[12];
		for (int i = 0; i < payArray.length; i++) {
			payArray[i] = Math.random() * 2000 + 3000;
		}
		System.out.println(Arrays.toString(payArray));

		double sum = 0;
		for (double i : payArray) {
			sum += i;
		}
		sum = sum / payArray.length;
		System.out.println(sum);

	}
}
