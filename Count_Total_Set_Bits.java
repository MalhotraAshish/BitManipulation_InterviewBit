package bit_manipulation_interviewBit;

import java.util.Arrays;

public class Count_Total_Set_Bits {
	public static void main(String args[]) {
		int num = 3;
		System.out.println(solve(num));
	}

	private static int solve(int num) {
		int arr[] = new int[num+1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i<arr.length; i++) {
			arr[i] = arr[i >> 1] + i&1;
			System.out.print(i);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("hello 1");
		return 0;
	}

//	private static int solve(int num) {
//		long mod = 1000000007;
//		if (num == 0)
//			return 0;
//		long cnt = 0;
//		for (long i = 31; i >= 0; --i) {
//			if (((1 << i) & num) != 0) {
//				// cnt+=(A&(~(1<<index)+1);
//				num = (num & (~(1 << i)));
//				cnt += i * (1 << (i - 1)) + num + 1;
//				cnt %= mod;
//			}
//		}
//
//		for (long i = 31; i >= 0; --i) {
//			if (((1 << i) & num) != 0) {
//				// cnt+=(A&(~(1<<index)+1);
//				num = (num & (~(1 << i)));
//				cnt += num + 1;
//				cnt %= mod;
//			}
//		}
//		return (int) cnt;
//	}

	// private static int solve(int num) {
	// int count = 0;
	// long mod = 1000000007;
	// while(num != 0) {
	// int temp = num;
	// while(temp!=0) {
	// count++;
	// temp = temp & (temp-1);
	// }
	// num--;
	// }
	// return (int) (count%mod);
	// }
}
