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

}
