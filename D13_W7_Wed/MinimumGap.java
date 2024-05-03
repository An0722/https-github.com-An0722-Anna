package D13_W7_Wed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumGap {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(1, 5, 9, 15, 20));
        int minGap = minimumGap(arr);
        System.out.println("Minimum gap in the array is " + minGap);
	}
	
	
	public static int minimumGap(List<Integer>arr) {
		Collections.sort(arr); // sap xep cac so gan nhau se nam canh nhau
		
		int minGap = Integer.MAX_VALUE; // khoi tao khoang cach lon nhat la gia tri nho nhat cua int
        for (int i = 1; i < arr.size(); i++) {
            int gap = arr.get(i) - arr.get(i - 1); // tinh gap giua 2 so lien tiep
            minGap = Math.min(minGap, gap); // cap nhat khoang cach nho nhat
        }
        
        return minGap;
	}
}
