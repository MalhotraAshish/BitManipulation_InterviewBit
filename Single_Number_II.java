package bit_manipulation_interviewBit;

import java.util.ArrayList;

public class Single_Number_II {
	public static void main(String args[]) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(1);
		System.out.println(singleNumber(list));
	}

	private static int singleNumber(final ArrayList<Integer> list) {
		int arr[] = new int[32];
		for(int e : list) {
			for(int i = 0; i<32; i++) {
				if((e & (1<<i))!=0) {
					arr[i]++;
				}
			}
		}
		int num = 0;
		for(int i = 0; i<32; i++) {
			if(arr[i] % 3 ==1) {
				num = num + (1<<i);
			}
		}
		return num;
	}
}
