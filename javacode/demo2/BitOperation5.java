package demo2;

import java.util.Scanner;

public class BitOperation5 {
	public static void main(String[] args) {
		int parking = 0b10110;
		System.out.println("停車位: " + Integer.toBinaryString(parking));
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入要取車的車位號: ");
		int car = scanner.nextInt();
		car = (int)Math.pow(2, car);
		// 檢查該車位是否有車 ?
		if((parking & car) != 0) {
			parking = parking - car;
			System.out.println("車子順利移出");
		} else {
			System.out.println("該車位無車可移!");
		}
		// 不會 0
		System.out.println("停車位: " + Integer.toBinaryString(parking));
		// 先補 ' '
		String parkingString = String.format("%5s", Integer.toBinaryString(parking));
		System.out.println("停車位: " + parkingString);
		// '0' 取代 ' '
		parkingString = parkingString.replace(' ', '0');
		System.out.println("停車位: " + parkingString);
			
	}
}