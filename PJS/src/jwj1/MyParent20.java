package jwj1;

public class MyParent20 {
	private int prv; // ���� Ŭ���������� ��� ����, ���� ���� ������ ������.
	int dft; //default �����ڴ� ���� ��Ű�� ����, default �����ڴ� ��������
	protected int prt; // �ٸ� ĳŰ���� �ڼտ��� ��� ����
	public int pub; // �ӵ� ��� ����
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}

}