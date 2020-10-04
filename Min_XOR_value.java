package bit_manipulation_interviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class Min_XOR_value {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(4);
		list.add(7);
		list.add(9);
		System.out.println(findMinXor(list));
	}

	private static int findMinXor(ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;
		Collections.sort(list);
		for (int i = 0; i < list.size() - 1; i++) {

			min = Math.min(min, list.get(i) ^ list.get(i + 1));

		}
		return min;
	}
}
