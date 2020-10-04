package bit_manipulation_interviewBit;

public class Divide_Integers {
	public static void main(String args[]) {
		int A = 0;
		int B = 1;
		System.out.println(divide(A, B));
	}

	private static int divide(int a, int b) {
		if (a == Integer.MIN_VALUE && b == -1) {
			return Integer.MAX_VALUE;
		}
		if (a == Integer.MIN_VALUE && b == 1) {
			return Integer.MIN_VALUE;
		}
		
		long A = Math.abs(a);
		long B = Math.abs(b);
		if(a == Integer.MIN_VALUE) {
			A = Integer.MAX_VALUE;
		}
		long res = 0;
		while (A - B >= 0) {
			
			long x = 0;
			while (A - (B << 1 << x) >= 0) {
				x++;
			}
			res = res + (1 << x);
			A = A - (B << x);
		}
		if (res > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		if ((a >= 0) == (b >= 0)) {
			return (int) res;
		} else {
			return -(int) res;
		}
	}
}
