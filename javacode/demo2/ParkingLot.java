package demo2;

import java.util.Scanner;

public class ParkingLot {
	public static void main(String[] args) {
		int parking = 0b00000; // 0

		parkinglot:  // 自訂迴圈的名字
		do {
			// 顯示目前最新車位狀態
			String parkingString = String.format("%5s", Integer.toBinaryString(parking));
			parkingString = parkingString.replace(' ', '0');
			System.out.println("停車位: " + parkingString);
			// 是否還有車位 ?
			boolean isEmpty = parking != 0b11111;
			//System.out.println("是否還有車位: " + isEmpty);
			System.out.println("是否還有車位: " + (isEmpty?"有空位":"車位已滿"));
			// 使用者操作
			Scanner scanner = new Scanner(System.in);
			System.out.print("請選擇: 停車(1) 取車(2) 離開(0) ==> ");
			int choice = scanner.nextInt();
			int car = -1;
			switch(choice) {
				case 1: // 停車(1)
					System.out.print("請選位 ==> ");
					car = scanner.nextInt();
					car = (int)Math.pow(2, car);
					if ((parking & car) == 0) { // 判斷是否該車位是空的
						parking = parking + car;
						System.out.println("停車完成!");
					} else {
						System.out.println("該車位不可停車!");
					}
					break;
				case 2: // 取車(2)
					System.out.print("請選位 ==> ");
					car = scanner.nextInt();
					car = (int)Math.pow(2, car);
					if ((parking & car) != 0) { // 判斷是否該車位是否有車
						parking = parking - car;
						System.out.println("取車完成!");
					} else {
						System.out.println("該車位無車可取!");
					}
					break;
				case 0: // 離開(0)
					break parkinglot;
			}

		} while(true);

	}
}