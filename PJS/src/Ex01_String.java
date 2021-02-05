public class Ex01_String {

	public static void printResult (Boolean result) {
		if(result) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}
	}
	
	public static void main(String[] args) {
		String str1="apple";
		String str2="apple";
		String str3 = new String("apple");
		String str4 = new String("apple");
		
		printResult(str1==str2);
		printResult(str2==str3);
		printResult(str3==str4);
		
		printResult(str2.contentEquals(str3));
	}
}
