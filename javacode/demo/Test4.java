package demo;

public class Test4 {
	public static void main(String[] args) {
		int money = 98765432;
		double bmi = 23.56789;
		double area = 1987.5678;
		char sex = '男';
		boolean isPass = true;
		String message = "Hello";

		System.out.printf("money = %d\n", money);
		System.out.printf("money = %,d\n", money);
		System.out.printf("bmi = %f\n", bmi);
		System.out.printf("bmi = %.2f\n", bmi);
		System.out.printf("area = %,.1f\n", area);
		System.out.printf("sex = %c\n", sex);
		System.out.printf("isPass = %b\n", isPass);
		System.out.printf("message = %s\n", message);

		double h = 170;  // 170.0
		double w = 60;   // 60.0
		h = h / 100; 
		bmi = w / (h*h);

		System.out.printf("身高(cm): %.1f 體重(kg): %.1f BMI: %.1f\n", h*100, w, bmi);
	}
}