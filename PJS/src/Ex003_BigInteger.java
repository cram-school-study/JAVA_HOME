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


//## 다음의 most_frequent(data) 함수를 만드시오
//
//함수호출 인수의 데이타 타입은 리스트
//가장 빈번히 나오는 단어를 찾아 return 시키는 Function을 만드시오.
//빈도수가 같은 경우는 맨 먼저 자주 사용하는 단어가 출력된다.

