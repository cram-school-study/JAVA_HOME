import java.util.ArrayList;

class Product {
	void annotationMethod() {
	}
}

class Radio extends Product {
	void annotationMethod() {
	}
}


public class Ex61_class_annotation2 {
	public static void main(String[] args) {
//		@SuppressWarnings({"unchecked", "deprecated"})
		ArrayList list = new ArrayList();
		
		list.add("ABC");
		Radio radio = new Radio();
		radio.annotationMethod();
	}
}
