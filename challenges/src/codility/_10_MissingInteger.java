package codility;

import java.util.Arrays;

//This is a demo task.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//Given A = [1, 2, 3], the function should return 4.
//
//Given A = [−1, −3], the function should return 1.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [−1,000,000..1,000,000].

public class _10_MissingInteger {

	public static int solution(int[] A) {
		int min = 1, lastNumber = 0;
		Arrays.sort(A);
		for (Integer i : A) {
			if (lastNumber != i) {
				if (i >= min + 1) {
					break;
				}
				if (i > 0)
					min++;
				lastNumber = i;
			}
		}
		return min;
	}

	public static int solutionImproved(int[] A) {
		int min = 1;
		Arrays.sort(A);
		
		for (Integer i : A) {
			if (i == min)
				min++;
			if (i > min)
				break;
		}
		
		return min;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 3, 6, 4, 1, 2 }));
		System.out.println(solution(new int[] { 1, 2, 3 }));
		System.out.println(solution(new int[] { -1, -3 }));
	}

}
