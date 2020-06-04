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

}
