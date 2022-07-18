// Java程式與使用者輸入資料互動
import java.util.Scanner;
public class Hello8 {
	public static void main(String[] args) {
		// 今有雞、兔同籠，上有三十五頭，下九十四足。問雞、兔各幾何？
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入雞+兔的總數: ");
		int sum = scanner.nextInt();  // 35
		System.out.print("請輸入雞腳+兔腳的總數: ");
		int feet = scanner.nextInt(); // 94;
		// 計算開始
		int rabbit = (feet - (sum*2))/(4-2);
		int chicken = sum - rabbit;
		System.out.println("雞: " + chicken);
		System.out.println("兔: " + rabbit);
	}
}