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

}
