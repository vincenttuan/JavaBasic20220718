package demo;

public class Test3 {
	public static void main(String[] args) {
		// 身分證判斷男女
		String id = "H187345123";
		//     index:0123456789
		char sex = id.charAt(1); // 身分證第二碼
		char before = id.charAt(2); // 身分證第三碼

		System.out.printf("身分證: %s\n", id);
		System.out.printf("身分證第二碼: %c\n", sex);
		System.out.printf("身分證第三碼: %c\n", before);

		// 判斷男女 if-else
		if(sex == '1') {
			System.out.println("男性");
		} else if (sex == '2') {
			System.out.println("女性");
		} else {
			System.out.println("性別錯誤");
		}

		// 判斷男女 switch-case
		// 使用時機單一變數的恆等式(==)判斷可以使用
		switch(sex) {
			case '1':
				System.out.println("男性");
				break;
			case '2':
				System.out.println("女性");
				break;
			default:
				System.out.println("性別錯誤");
		}


	}
}