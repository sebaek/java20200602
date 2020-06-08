package codingbat.array1;

public class Solution {
	public boolean firstLast6(int[] nums) {

		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length > 0) {
			return nums[0] == nums[nums.length - 1];
		}

		return false;
	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public int[] rotateLeft3(int[] nums) {
		/*
		 * int a = nums[0]; int b = nums[1]; int c = nums[2];
		 * 
		 * int[] res = {b, c, a};
		 */

		int first = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			nums[i] = nums[i + 1];
		}
		nums[nums.length - 1] = first;

		return nums;
	}

	public int[] reverse3(int[] nums) {
		return new int[] { nums[2], nums[1], nums[0] };
	}

}
