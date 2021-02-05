public class Ex38_TryCatch_test01 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			Exception e = new Exception("일부러 발생");
			System.out.println(4);
			throw e;
		}catch(ArithmeticException e) {
			if (e instanceof ArithmeticException) {
				e.printStackTrace();
				System.out.println(e);
				System.out.println(e.getMessage());
			} else System.out.println("0으로 나눴군! 안탐!");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("에러!!!!");
			System.out.println(4);
		}finally {
			System.out.println("종료됐어요!!");
		}
		
		System.out.println(5);
	}
}
