import java.util.ArrayList;
import java.util.Iterator;

public class Ex57_class_GenericType4 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add( new Student("Person1", 26, 1) );
		list.add( new Student("Person2", 22, 2) );
		list.add( new Student("Person3", 21, 3) );
		list.add( new Student("Person4", 20, 4) );
		list.add( new Student("Person5", 28, 5) );
		
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.printf("%s, %d, %d\n", s.nameString, s.grade, s.number);
		}
	}

}

class Student{
	String nameString = "";
	int grade;
	int number;
	
	public Student(String nameString, int grade, int number) {
		this.nameString = nameString;
		this.grade = grade;
		this.number = number;
	}
	
	
}	
