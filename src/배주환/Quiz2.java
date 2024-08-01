package 배주환;

public class Quiz2 {

	public static void main(String[] args) {

		int num = 15;

		if (num >= 3 && num <= 5) {
			System.out.println(num + "월은 봄입니다.");
		} else if (num >= 6 && num <= 8) {
			System.out.println(num + "월은 여름입니다");
		} else if (num >= 9 && num <= 11) {
			System.out.println(num + "월은 가을 입니다.");
		} else if (num == 12 || num == 1 || num == 2) {
			System.out.println(num + "월은 겨울입니다.");
		} else {
			System.out.println(num + "월은 잘못된 값입니다.");
		}
	}

}
