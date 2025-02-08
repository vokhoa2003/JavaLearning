package lamquenjava;

import java.util.Scanner;

public class HamToanHoc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap so b: ");
		int b = scanner.nextInt();

		System.out.println("Min = " + Math.min(a, b));
		scanner.close();
	}
}
