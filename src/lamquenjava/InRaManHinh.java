package lamquenjava;

import java.util.Scanner;

public class InRaManHinh {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten: ");
		String name = scanner.nextLine();
		System.out.println("Nhap tuoi: ");
		int age = scanner.nextInt();
		System.out.println("My name is: " + name + " Age is: " + age);
		scanner.close();
	}
}
