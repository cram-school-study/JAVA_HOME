
public class Ex43_class_ObjectMethod {

	public static void main(String[] args) {
		String animalString = "dog, cat, bear, tiger, elephant";
		String[] ani_arr = animalString.split(",");
		
		int tmp = 1000;
		String test1 = "지금 내 통장에";
		String test2 = "만원 있습니다.";
		
		
		for(int i=0; i<ani_arr.length; i++) {
			System.out.println(ani_arr[i].trim());
		}
		
		String str = String.join(",", ani_arr);
		System.out.println(str);
		
		System.out.println(String.join("", test1, tmp+"", test2));
	}
}
