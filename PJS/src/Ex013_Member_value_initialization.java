class Product {
	static int count;
	int serialNO;
	
	{
		count++;
		serialNO = count;
	}
	
	public Product() {}
}


public class Ex013_Member_value_initialization {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� �ø��� ��ȣ�� - " + p1.serialNO);
		System.out.println("p2�� �ø��� ��ȣ�� - " + p2.serialNO);
		System.out.println("p3�� �ø��� ��ȣ�� - " + p3.serialNO);
		System.out.println("�ν��Ͻ��� ������ " +Product.count);
	}
}

