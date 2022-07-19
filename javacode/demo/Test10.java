package demo;

import java.util.Random;
import java.util.Scanner;

// 1. 0~99 猜數字
// 2. 可與電腦對戰
public class Test10 {
	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(100); // 0~99 隨機數
		System.out.println("Game start !");
		int min = 0;
		int max = 99;
		do {

			// user guess 玩家猜
			Scanner scanner = new Scanner(System.in);
			System.out.printf("玩家請在 %d~%d 猜一數字: ", min, max);
			int user_guess = scanner.nextInt();
			if (user_guess > ans) {
				max = user_guess;
			} else if (user_guess < ans) {
				min = user_guess;
			} else {
				System.out.println("玩家猜對了! 玩家贏~");
				break;
			}

			// pc guess 電腦猜


		} while(true);

		System.out.println("Game over !");
	}
}