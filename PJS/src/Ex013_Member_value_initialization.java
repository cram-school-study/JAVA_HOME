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
		
		System.out.println("p1의 시리얼 번호는 - " + p1.serialNO);
		System.out.println("p2의 시리얼 번호는 - " + p2.serialNO);
		System.out.println("p3의 시리얼 번호는 - " + p3.serialNO);
		System.out.println("인스턴스의 갯수는 " +Product.count);
	}
}

