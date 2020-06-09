package codingbat.warmup1;

public class Solution {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		boolean notWeek = !weekday;
		boolean result = notWeek || vacation;

		return result;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		return !(aSmile ^ bSmile);
	}

	public int sumDouble(int a, int b) {
		int result = a + b;

		result = (a == b) ? result * 2 : result;

		return result;

	}

	public int diff21(int n) {
		// int diff = 21 - n;
		// diff = (diff < 0) ? -diff : diff;
		// diff = (n > 21) ? diff * 2 : diff;

		int diff = Math.abs(21 - n);
		if (n > 21) {
			diff *= 2;
		}

		return diff;
	}

	public boolean parrotTrouble(boolean talking, int hour) {

		return talking && (hour < 7 || hour > 20);
	}

	public boolean makes10(int a, int b) {
		boolean b1 = (a == 10) || (b == 10);
		boolean b2 = (a + b) == 10;

		return b1 || b2;
	}

	public boolean nearHundred(int n) {
		return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
	}

	public boolean posNeg(int a, int b, boolean negative) {
		boolean b1 = (a > 0 && b < 0) || (a < 0 && b > 0);
		boolean b2 = a < 0 && b < 0;

		return negative ? b2 : b1;
	}

	public String notString(String str) {

		String start = "";

		if (str.length() >= 3) {
			start = str.substring(0, 3);
		}

		if (start.equals("not")) {
			return str;
		} else {
			return "not " + str;
		}

	}

	public String missingChar(String str, int n) {
		// String res = "";

		// for (int i = 0; i < str.length(); i++) {
		// if (i != n) {
		// res += str.charAt(i);
		// }
		// }

		return str.substring(0, n) + str.substring(n + 1);
	}

	public String frontBack(String str) {
		if (str.length() < 2) {
			return str;
		}

		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);

		String mid = str.substring(1, str.length() - 1);

		return last + mid + first;
	}

	public String front3(String str) {
		int len = str.length() >= 3 ? 3 : str.length();
		String front = str.substring(0, len);

		return front + front + front;
	}

	public String backAround(String str) {
		char last = str.charAt(str.length() - 1);

		return last + str + last;
	}

	public boolean or35(int n) {
		return (n % 3 == 0) || (n % 5 == 0);
	}

	public String front22(String str) {
		String front = "";
		if (str.length() >= 2) {
			front = str.substring(0, 2);
		} else {
			front = str;
		}

		return front + str + front;
	}

	public boolean startHi(String str) {
		String front = "";

		if (str.length() >= 2) {
			front = str.substring(0, 2);
		}

		return front.equals("hi");
	}

	public boolean icyHot(int temp1, int temp2) {
		int min = Math.min(temp1, temp2);
		int max = Math.max(temp1, temp2);

		return min < 0 && max > 100;
	}

	public boolean in1020(int a, int b) {
		boolean aa = a >= 10 && a <= 20;
		boolean bb = b >= 10 && b <= 20;

		return aa || bb;
	}

}
