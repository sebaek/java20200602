package chap05.exercises;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		int sum = 0;
		double avg = 0.0;
		
		// 작성위치 
		int numItems = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
				sum += array[i][j];
				numItems++;
			}
		}
		avg = (double) sum / numItems;
				
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}















