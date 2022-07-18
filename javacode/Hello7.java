// 變數(Java)與使用者(User)互動

import java.util.Scanner;

public class Hello7 {
	public static void main(String[] args) {
		// 建立一個 Scanner 物件
		// System.in -> 系統輸入, 預設指的是鍵盤
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身高: ");
		// scanner.nextDouble() -> 攫取使用者在鍵盤所輸入的資料並轉成 double 浮點數
		double h = scanner.nextDouble();
		
		System.out.print("請輸入體重: ");
		double w = scanner.nextDouble();

		// 印出使用者所輸入的身高與體重的資料 
		System.out.println("身高: " + h);
		System.out.println("體重: " + w);

		// 計算 BMI
		h = h / 100; // 將身高(cm) -> 身高(m)
		double bmi = w / (h*h);
		System.out.println("BMI: " + bmi);

	}
}