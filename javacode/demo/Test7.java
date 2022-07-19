package demo;

import java.util.Random;

public class Test7 {
	public static void main(String[] args) {
		Random random = new Random();
		boolean pass = true;

		while(pass) {
			int n = random.nextInt(100); // 0~99的亂數
			System.out.println(n);
			if (n == 99) {
				pass = false;
			}
		}
		
	}
}