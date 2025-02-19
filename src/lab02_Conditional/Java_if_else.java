package lab02_Conditional;

import java.util.Scanner;

public class Java_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Double money;
		do {
			System.out.println("Nhập số tiền: ");
			money = scanner.nextDouble();
			if (money < 10000 && money > 0) {
				System.out.println("Không đóng thuế");
			} else if (10000 <= money && money <= 15000) {
				money = money * 0.1;
				System.out.println("Thuế là: " + money);
			} else if (15000 <= money && money <= 30000) {
				money = money * (20 / 100); // nếu muốn hiển thị đúng kiểu double thì phải để là 0.2 hoặc 20.0/100
				System.out.println("Thuế là: " + money);
			} else if (money == 0) {
				System.out.println("Kết thúc");
			} else {
				money = money * (50.0 / 100);
				System.out.println("Thuế là: " + money);
			}
		} while (money != 0);
	}
}
