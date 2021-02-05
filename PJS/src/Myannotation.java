import java.lang.annotation.Target;

// @interface <- 내가 내것의 어노테이션을 만들겠다.
@Target({FIELD, TYPE, TYPE_USE})

public @interface Myannotation{}

class Myclass {
	int i;
	
	Myclass mc;	
}