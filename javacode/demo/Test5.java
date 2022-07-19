package demo;
import java.text.DecimalFormat;

public class Test5 {

	public static void main(String[] args) {
		double balance = 123456.789;
		// 先將 balance 加上千分號與小數點2位的字串放在 message 變數中
		// 再將 message 透過 println() 印出
		// 使用 String.format() 字串格式化
		String message = String.format("%,.2f", balance);
		System.out.println(message);  // 印出效果 123,456.79

		double exchange = 12345.5;
		// 想要客製化印出 1,2345.50
		DecimalFormat df = new DecimalFormat("####,####.00");
		System.out.println(df.format(exchange));



	}

}