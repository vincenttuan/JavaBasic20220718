package demo2;

public class Test {
	public static void main(String[] args) {
		int x = 0b00100;
		System.out.printf("x=%5s\n", Integer.toBinaryString(x));
		System.out.printf("x=%05d\n", 100);
		// Integer.parseInt(字串內容) -> 將 字串內容 轉成 數字
		System.out.printf("x=%05d\n", Integer.parseInt(Integer.toBinaryString(x)));
		System.out.printf("x=%05d\n", Integer.valueOf(Integer.toBinaryString(x)));
	}
}