package demo2;

import java.util.Scanner;

public class BitOperation4 {
	public static void main(String[] args) {
		int parking	= 0b10010;
		System.out.println("停車場: " + Integer.toBinaryString(parking));
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入要停的車位號: ");
		int car = scanner.nextInt();
		car = (int)Math.pow(2, car);
		System.out.println(car);
		// 判斷該車位是否是空位 ?
		if((parking & car) == 0) {
			System.out.println("將車子停進車位");
			parking = parking + car;
		} else {
			System.out.println("該車位已有車, 不可再停!");
		}
		System.out.println("停車場: " + Integer.toBinaryString(parking));
		
	}
}