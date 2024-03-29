package demo;
import java.util.Scanner;
/*
90 <= score <= 100 ... A
80 <= score <   90 ... B
70 <= score <   80 ... C
60 <= score <   70 ... D
 0 <= score <   60 ... E
*/
public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入分數: ");
		int score = scanner.nextInt();
		
		// 判斷等第使用 if-else
		// && and, || or
		if (score >= 90 && score <= 100) {
			System.out.println("A");
		} else if (score >= 80 && score < 90){
			System.out.println("B");
		} else if (score >= 70 && score < 80) {
			System.out.println("C");
		} else if (score >= 60 && score < 70) {
			System.out.println("D");
		} else if (score >= 0 && score < 60) {
			System.out.println("E");
		} else {
			System.out.println("成績輸入錯誤");
			System.out.println("成績必須介於0~100間");
		}

		// 判斷等第使用 switch-case
		if(score >= 0 && score <= 100) {
			switch(score/10) {
				case 10:
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("E");
			}	
		} else {
			System.out.println("成績輸入錯誤");
			System.out.println("成績必須介於0~100間");
		}

		

	}
}
