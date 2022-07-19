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

		// 判斷設籍前身分 swicth-case
		/*
			6	取得國籍之外國人
			7	無戶籍國民
			8	港澳居民
			9	大陸地區人民
			0~5	其他
		*/
		switch(before) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
				System.out.println("其他");
				break;
			case '6':
				System.out.println("取得國籍之外國人");
				break;
			case '7':
				System.out.println("無戶籍國民");
				break;
			case '8':
				System.out.println("港澳居民");
				break;
			case '9':
				System.out.println("大陸地區人民");
				break;
			default:
				System.out.println("資料錯誤");	

		}


	}
}