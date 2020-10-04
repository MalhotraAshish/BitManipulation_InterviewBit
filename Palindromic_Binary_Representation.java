package bit_manipulation_interviewBit;

public class Palindromic_Binary_Representation {
	public static void main(String args[]) {
		int n = 9;
		System.out.println(solve(n));
	}

	private static int solve(int n) {
		int countOfNums = 0;
		int lengthOfBits = 0;
		while(countOfNums<n) {
			lengthOfBits++;
			countOfNums = countOfNums+(1<<((lengthOfBits-1))/2);
		}
		
		countOfNums = countOfNums-(1<<((lengthOfBits-1)/2));
		int offSet = n-countOfNums-1;
		
		int ans = 1<<(lengthOfBits-1);
		ans = ans | (offSet<<(lengthOfBits/2));
		
		int valForRev = ans>>(lengthOfBits/2);
		
		ans = ans|reverse(valForRev);
				
		return ans;
	}

	private static int reverse(int n) {
		int rev = 0;
		while(n > 0) {
			rev <<= 1;
			
			if((n&1) == 1) {
				rev = rev^1;
			}
			n >>= 1;
		}
		return rev;
	}
}
