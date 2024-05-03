package D13_W7_Wed;

import D12_W7_Sat.Sort;

public class FindIndex {
	public static void main(String[] args) {
		int[] arr = {4,5,11,44,56,92,100};
		Sort.sortArray(arr); // sort array theo thu tu be den lon
		int number = 11;
		int index = findIndex(arr, number);
		
		if (index != 000) {
			System.out.println(number + " nam tai vi tri index so " + index);
		} else {
			System.out.println(number + " khong ton tai trong array nay.");
		}
	}
	
	public static int findIndex(int[] arr, int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return i; // return vi tri index neu tim thay so can tim
			}
		}
		return 000; // return 000 khi khong tim thay so can tim
	}
}
