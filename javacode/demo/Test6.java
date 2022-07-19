package demo;

import java.util.Random; // 0 ~ 1 隨機亂數

public class Test6 {
	public static void main(String[] args) {
		Random random = new Random();

		boolean pass = false;
		while(pass) {

			System.out.println(random.nextInt()); // 取得一個整數隨機數
			System.out.println(random.nextInt(10)); // 取得0~9隨機整數							

		}


	}
}
