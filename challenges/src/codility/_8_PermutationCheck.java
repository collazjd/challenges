package codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//A non-empty array A consisting of N integers is given.
//
//A permutation is a sequence containing each element from 1 to N once, and only once.
//
//For example, array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//is a permutation, but array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//is not a permutation, because value 2 is missing.
//
//The goal is to check whether array A is a permutation.
//
//Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
//
//For example, given array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//    A[3] = 2
//the function should return 1.
//
//Given array A such that:
//
//    A[0] = 4
//    A[1] = 1
//    A[2] = 3
//the function should return 0.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000];
//each element of array A is an integer within the range [1..1,000,000,000].

public class _8_PermutationCheck {

	public static int solution(int[] A) {
		int totalSum = A.length * (A.length + 1) / 2;
		int currentSum = IntStream.of(A).sum();
		return totalSum == currentSum ? 1 : 0;
	}

	public static int rightSolution(int A[]) {
		List<Integer> a = Arrays.stream(A).boxed().collect(Collectors.toList());
		Collections.sort(a);

		for (int i = 0; i < a.size(); i++)
			if (a.get(i) != (i + 1))
				return 0;

		return 1;
	}

	public static int rightSolutionImproved(int A[]) {
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++)
			if (A[i] != (i + 1))
				return 0;

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] { 4, 1, 3, 2 }));
		System.out.println(solution(new int[] { 4, 1, 3 }));
		System.out.println(rightSolution(new int[] { 4, 1, 3, 2 }));
		System.out.println(rightSolution(new int[] { 4, 1, 3 }));
	}

}
