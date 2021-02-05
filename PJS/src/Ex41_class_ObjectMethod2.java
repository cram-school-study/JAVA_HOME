import java.util.Objects;

class Person {
	long id;
	
	Person() {} //디폴트 생성자
	Person(long id) {
		this.id = id;
	}
	
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return this.id == ((Person) obj).id;
		}else {
			return false;
		}
	}
}



public class Ex41_class_ObjectMethod2 {
	public static void main(String[] args) {
		
		Person p1 = new Person(971225112210L);
		Person p2 = new Person(971225112210L);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	
	}
}
