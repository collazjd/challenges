package codility;

//Write a function:
//
//class Solution { public int solution(int A, int B, int K); }
//
//that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
//
//{ i : A ≤ i ≤ B, i mod K = 0 }
//
//For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
//
//Write an efficient algorithm for the following assumptions:
//
//A and B are integers within the range [0..2,000,000,000];
//K is an integer within the range [1..2,000,000,000];
//A ≤ B.

public class _12_CountDiv {

	public static int solution(int A, int B, int K) {
		int count = 0;
		while (A <= B) {
			if (A % K == 0) {
				count++;
				A += K;
			} else {
				A++;
			}
		}
		return count;
	}

	public static int solutionImproved(int A, int B, int K) {
		int resta = B - A;

		if (resta == 0) {
			if (A == 0 || B % K == 0)
				return 1;
			return 0;
		}

		if (resta % K == 0 && A % K == 0)
			return (int) Math.ceil((double) resta / K) + 1;

		if (resta % K == 0)
			return resta / K;

		return (int) Math.ceil((double) resta / K);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(6, 11, 2));
		System.out.println(solutionImproved(101, 123456789, 10000));
	}

}
