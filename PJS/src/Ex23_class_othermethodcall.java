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
		System.out.println("BB클래스의 메소드 호출");
	}
}

class CC implements I {
	public void method() {
		System.out.println("CC클래스의 메소드 호출");
	}
}

public class Ex23_class_othermethodcall {
	public static void main(String[] args) {
		AA aa = new AA();
		aa.method1(new BB());
		aa.method1(new CC());
	}
}
