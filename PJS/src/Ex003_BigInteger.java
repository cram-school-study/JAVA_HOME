import java.math.BigInteger;

public class Ex003_BigInteger {
	public static void main(String[] args) {
		BigInteger a = BigInteger.valueOf(100_000_000);
		BigInteger b = BigInteger.valueOf(200_000_000);
		BigInteger c;
		
		c = a.multiply(b);
		System.out.println(c);
	}
}


//## ������ most_frequent(data) �Լ��� ����ÿ�
//
//�Լ�ȣ�� �μ��� ����Ÿ Ÿ���� ����Ʈ
//���� ����� ������ �ܾ ã�� return ��Ű�� Function�� ����ÿ�.
//�󵵼��� ���� ���� �� ���� ���� ����ϴ� �ܾ ��µȴ�.

