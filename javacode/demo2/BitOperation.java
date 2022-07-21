package demo2;

public class BitOperation {
	public static void main(String[] args) {
		// 位元運算 &, |, ^
		int x = 5 & 3;
		System.out.println("x=" + x);
		System.out.printf("x=%d\n", x);
		
		int y = 5 | 3;
		System.out.println("y=" + y);
		System.out.printf("y=%d\n", y);

		int z = 5 ^ 3;
		System.out.println("z=" + z);
		System.out.printf("z=%d\n", z);
	}
}