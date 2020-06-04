package codingbat.warmup1;

public class Solution {
	public boolean sleepIn(boolean weekday, boolean vacation) {
		boolean notWeek = !weekday;
		boolean result = notWeek || vacation;

		return result;
	}

}
