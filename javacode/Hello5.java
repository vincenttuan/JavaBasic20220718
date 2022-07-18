// 變數 + 數學計算
// 資料型態:
// 整數一般預設使用 int
// 浮點數一般預設使用 double
public class Hello5 {

	public static void main(String[] args) {
		// 假設半徑 = 10, 圓面積 = ?
		System.out.println(10 * 10 * 3.14);
		// 假設半徑 = 任意整數, 圓面積 = ?
		int r = 10; // r 就是半徑的變數
		final double pi = 3.14; // pi 就是圓周率的變數
							    // final 表示設定後就不可變更
		System.out.println(r * r * pi);

		r = 20; // r 是一個變數, 所以內容可以根據需要而改變
		//pi = 3.1415926;  // pi 是 final 變數ㄝ, 不可再改變
		System.out.println(r * r * pi);

		// 若 r = 15; 球體積 = ?
		r = 15;
		double volume = 4.0/3*pi*r*r*r;
		System.out.println(volume);

	}

}