import java.util.Arrays;

public class Ex007_Array_sortbasic {

	public static void main(String[] args) {
		int[] arr = {4, 23, 33, 15, 17, 19};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		String[] fruits = {"apple", "orange", "kiwi", "kiwi", "Strawbeery", "melon"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		
		for(int i: arr) {
		}
		
	}

}
