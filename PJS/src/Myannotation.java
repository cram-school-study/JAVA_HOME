import java.lang.annotation.Target;

// @interface <- ���� ������ ������̼��� ����ڴ�.
@Target({FIELD, TYPE, TYPE_USE})

public @interface Myannotation{}

class Myclass {
	int i;
	
	Myclass mc;	
}