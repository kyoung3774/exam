package 배주환;

public class Quiz3 {

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		for (int j = 0; j <= 100; j++) {
			if (sum >= 300) {
				break;
			}
			i = j;
			sum += j;
		}
		System.out.println("i:" + i + " , sum:" + sum);
	}

}
