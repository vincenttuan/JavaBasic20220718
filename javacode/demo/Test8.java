package demo;

public class Test8 {
	public static void main(String[] args) {
		// while 與 break, continue
		// break; 跳離 while 迴圈 (結束迴圈)
		// continue; 提早執行下一次的迴圈

		int n = 0;
		while(true) {
			n = n + 1; // 每次加 1
			if (n == 8) {
				break; // 離開迴圈
			}
			if (n % 3 == 0) { // 若 n 是 3 的倍數
				continue; // 提前執行下一次的迴圈
			}
			System.out.println(n);
		}

	}
}