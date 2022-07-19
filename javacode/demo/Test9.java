package demo;

import java.util.Random;
import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		// 猜數字 0~9
		Random random = new Random();
		int ans = random.nextInt(10); // 0~9 的隨機數
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("請在 0~9 猜一數字: ");
			int guess = scanner.nextInt();
			// 判斷邏輯
			if(guess > ans) {
				System.out.println("猜大了");
				continue;
			} else if(guess < ans) {
				System.out.println("猜小了");
				continue;
			} else {
				System.out.println("bingo 猜對了");
				break;
			}

		} while(true);


	}
}