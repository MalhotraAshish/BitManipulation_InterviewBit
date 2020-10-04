package bit_manipulation_interviewBit;

//import java.math.BigInteger;
import java.util.ArrayList;

public class Different_Bits_Sum_Pairwise {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(81);
		list.add(13);
		list.add(2);
		list.add(7);
		list.add(96);
		System.out.println(cntBits(list));
	}

	private static int cntBits(ArrayList<Integer> list) {
		long mod = 1000000007L;
		long res = 0;
		for (int i = 0; i < 32; i++) {
			int mask = 1<<i;
			long o = 0;
			long z = 0;
			for(int j = 0; j<list.size(); j++) {
				if((mask&list.get(j)) == 0) {
					z++;
				}else {
					o++;
				}
			}
			res = res + ((o * z)*2)%mod;
		}
		return (int) (res%mod);
	}
}
