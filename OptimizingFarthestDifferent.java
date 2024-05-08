package D14_W7_Sat;

import java.util.Arrays;

public class OptimizingFarthestDifferent {
	public static void main(String[] args) {
		int[] A = {4,6,2,2,6,6,4};
		Solution solution = new Solution();
		System.out.println(solution.solution(A));
				
	}
	static class Solution {
		public int solution (int[] A) {
			//int N = A.length;
			Arrays.sort(A);
			int result = 0;
			//for (int i = 0; i < N; i++)
			for (int i = 1; i < A.length; i++) {
				//for (int j = i; j < N; j++)
				//if (A[i] != A[j])
				if (A[i] != A[i - 1]) {
					//result = Math.max(result, j-i);
					result = Math.max(result, i - 1);
				}
			}
			return result;
		}
	}
}
