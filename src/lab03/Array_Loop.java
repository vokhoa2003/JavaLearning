package lab03;

import java.util.Arrays;
import java.util.Collections;

public class Array_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = { 10, 5, 20, 30, 1, 3, 69, 12, 2 };
//		for (int i = 0; i < a.length - 1; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		System.out.println("a = " + Arrays.toString(a));
		Integer[] numbers = { 10, 5, 40, 1 };
		Arrays.sort(numbers, Collections.reverseOrder());
		System.out.println(Arrays.toString(numbers));

	}

}
