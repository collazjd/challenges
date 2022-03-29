package codility;

import java.util.Arrays;
import java.util.stream.IntStream;

//An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
//
//Your goal is to find that missing element.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A, returns the value of the missing element.
//
//For example, given array A such that:
//
//  A[0] = 2
//  A[1] = 3
//  A[2] = 1
//  A[3] = 5
//the function should return 4, as it is the missing element.

public class _5_PermutationElementMissing {

	public static int solution(int[] A) {

		if (A.length == 0)
			return 1;

		Arrays.sort(A);
		int missingElement = 1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] != missingElement)
				break;
			missingElement++;
		}
		return missingElement;
	}

	public static int aritmeticSolution(int[] A) {
		long arraySum = IntStream.of(A).sum();
		
		// I added 1 to A.lenght cause A array is the total series minus 1 element
		// (element missing)
		// and expectedSum is the sum of the entire serie
		long expectedSum = (A.length + 1) * (1 + A.length + 1) / 2;
		
		return (int) (expectedSum - arraySum);
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 2, 1, 3, 5 }));
	}
}
