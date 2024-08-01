package 배주환;

public class Quiz4 {

	public static void main(String[] args) {
		
		
		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 2, 4 };
		
		System.out.println("첫번째 배열:" + sum(arr1));
		System.out.println("두번째 배열:" + sum(arr2));
		
	}

	public static int sum(int[] arr) {
		
		int sum=0;
	
		for(int i : arr	) {
			if(arr.length<3) {
				return -999;
			} else {
				sum+=i;
			}
		}
		return sum;
		
	}
}
