package bit_manipulation_interviewBit;

import java.util.ArrayList;

public class Single_Number {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(3);
		
		System.out.println(singleNumber(list));
	}
	private static int singleNumber(final ArrayList<Integer> list) {
		int num = 0;
		for(int i = 0; i<list.size(); i++) {
			num = num^list.get(i);
		}
		return num;
	}
	/*private static int singleNumber(final ArrayList<Integer> list) {
		int arr[] = new int[32];
		for(int e : list) {
			for(int i = 0; i<32; i++) {
				if((e & (1<<i))==1) {
					arr[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int num = 0;
		for(int i = 0; i<32; i++) {
			if(arr[i] % 2 ==1) {
				num = num + (1<<i);
			}
		}
		return num;
	}*/
}
