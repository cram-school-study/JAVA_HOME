class AA {
	public void method1(I i) {
		i.method();
	}
}

interface I {
	public void method();
}

class BB implements I {
	public void method() {
		System.out.println("BBŬ������ �޼ҵ� ȣ��");
	}
}

class CC implements I {
	public void method() {
		System.out.println("CCŬ������ �޼ҵ� ȣ��");
	}
}

public class Ex23_class_othermethodcall {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.method1(new BB());
		aa.method1(new CC());
	}
}
