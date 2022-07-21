package demo2;

public class BitOperation3 {
	public static void main(String[] args) {
		int a = 0b10010;
		System.out.println(a + " = " + Integer.toBinaryString(a));
		int car = 0b00100;
		System.out.println(car + " = " + Integer.toBinaryString(car));
		a = a + car;
		System.out.println(a + " = " + Integer.toBinaryString(a));
		int car2 = 0b00010;
		System.out.println(car2 + " = " + Integer.toBinaryString(car2));
		a = a - car2;
		System.out.println(a + " = " + Integer.toBinaryString(a));
	}
}