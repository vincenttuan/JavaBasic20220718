public class Hello6 {
	public static void main(String[] args) {
		// = 代表指派運算子
		// == 代表比較運算子
		int x = 11;
		int y = 0b01011; // 0b 表示後面是二進位資料
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		int a = 0xab; // 0x 表示後面是16進位資料
		int b = 017;  // 0 表示後面是8進位資料
		System.out.println(a);
		System.out.println(b);
		// 工程標記 / 科學記號
		// 必須要使用 double
		// 表示 -> 4200000
		double c = 42e5; // 42 * 10的5次方
		System.out.println(c);
		double d = 4.2e6; // 4.2 * 10的6次方
		System.out.println(d);
		// float 浮點數
		float f = 3.14F; // 後面加上 F 或 f 轉型
		System.out.println(f);
		// 字元
		char i = '中'; // 放中文字
		char j = 'A';  // 放英文字
		char k = 65;   // 放數字時會轉ASCII Code
		char m = '\u0041'; // \\u表示 unicode 編碼
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		// 布林值 boolean
		// 不是放 true(成立) 就是放 false(不成立)
		boolean t = true;
		boolean u = false;
		boolean v = 85 >= 60; // true
		boolean w = 85 <= 60; // false
		System.out.println(t);
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);

	}
}