package jwj1;

public class MyParent20 {
	private int prv; // 같은 클래스에서만 사용 가능, 가장 좁은 범위를 가진다.
	int dft; //default 제어자는 같은 패키지 접근, default 제어자는 생략가능
	protected int prt; // 다른 캐키지의 자손에서 사용 가능
	public int pub; // 머두 사용 가능
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}

}