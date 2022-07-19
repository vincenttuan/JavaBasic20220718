package demo;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello Test 測試~");
		int score = 75;
		
		// case 1 利用三元運算子(? :)
		System.out.println( score >= 60 ? "及格" : "不及格" );

		// case 2 利用三元運算子(? :)
		// 透過三元運算子將結果放到 result 變數字串內容中
		String result = score >= 60 ? "及格" : "不及格";
		System.out.println(result);

		// case 3 利用 if-else
		if(score >= 60)
			System.out.println("及格");
		else
			System.out.println("不及格");

		// case 4 利用 if-else (帶有 { ... })
		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}

		// case 5 利用 if-else
		boolean isPass = score >= 60;
		if(isPass) { // 同等於 if(isPass == true)
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}

	}
}