package codingbat.warmup2;

public class Solution {
	public String stringTimes(String str, int n) {
		String result = "";

		for (int i = 0; i < n; i++) {
			result += str;
		}

		return result;
	}

	public String frontTimes(String str, int n) {
		int len = Math.min(3, str.length());
		String front3 = str.substring(0, len);
		String result = "";

		for (int i = 0; i < n; i++) {
			result += front3;
		}

		return result;
	}

	int countXX(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				count++;
			}
		}

		return count;
	}

	boolean doubleX(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				if (str.charAt(i + 1) == 'x') {
					return true;
				} else {
					return false;
				}
			}
		}

		return false;
	}

	public String stringBits(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i += 2) {
			result += str.charAt(i);
		}

		return result;
	}

	public String stringSplosion(String str) {
		String result = "";
		String sub = "";
		for (int i = 0; i < str.length(); i++) {
			sub += str.charAt(i);
			result += sub;
		}

		return result;
	}

	public int last2(String str) {
		int count = 0;

		if (str.length() <= 2) {
			return count;
		}

		String last2 = str.substring(str.length() - 2);

		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals(last2)) {
				count++;
			}
		}

		return count;
	}

	public int arrayCount9(int[] nums) {
		int count = 0;

		for (int n : nums) {
			if (n == 9) {
				count++;
			}
		}

		return count;
	}

	public boolean arrayFront9(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				return true;
			}

			if (i == 3) {
				break;
			}
		}

		return false;
	}

	public boolean array123(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 1) {
				if (nums[i + 1] == 2 && nums[i + 2] == 3) {
					return true;
				}
			}
		}

		return false;
	}

	public int stringMatch(String a, String b) {
		int loop = Math.min(a.length(), b.length());
		loop--;

		int count = 0;
		for (int i = 0; i < loop; i++) {
			if (a.charAt(i) == b.charAt(i)) {
				if (a.charAt(i + 1) == b.charAt(i + 1)) {
					count++;
				}
			}
		}

		return count;
	}

	public String stringX(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || i == str.length() - 1 || str.charAt(i) != 'x') {
				result += str.charAt(i);
			}
		}

		return result;
	}

	public String altPairs(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (i % 4 == 0 || (i - 1) % 4 == 0) {
				result += str.charAt(i);
			}
		}

		return result;
	}

	public String stringYak(String str) {
		return str.replace("yak", "");
		// String result = "";

		// int i = 0;

		// while (i < str.length()) {
		// if (i < str.length() - 2 && str.substring(i, i+3).equals("yak")) {
		// i += 3;
		// } else {
		// result += str.charAt(i);
		// i++;
		// }
		// }

		// return result;
	}

}
