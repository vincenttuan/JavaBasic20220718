// 程式的邏輯判斷
import java.util.Scanner;
public class Hello9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分數成績: ");
		int score = scanner.nextInt();
		System.out.println("您所輸入的成績是: " + score);
		System.out.println("系統判斷...");
		// 判斷成績是否及格 ?
		System.out.println( score >= 60 ? "及格" : "不及格" );
		// 判斷成績是偶數還是奇數 ?
		System.out.println( score % 2 == 0 ? "偶數" : "奇數" );
	}
}