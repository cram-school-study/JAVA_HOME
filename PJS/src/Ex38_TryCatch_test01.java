public class Ex38_TryCatch_test01 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			Exception e = new Exception("�Ϻη� �߻�");
			System.out.println(4);
			throw e;
		}catch(ArithmeticException e) {
			if (e instanceof ArithmeticException) {
				e.printStackTrace();
				System.out.println(e);
				System.out.println(e.getMessage());
			} else System.out.println("0���� ������! ��Ž!");
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("����!!!!");
			System.out.println(4);
		}finally {
			System.out.println("����ƾ��!!");
		}
		
		System.out.println(5);
	}
}
