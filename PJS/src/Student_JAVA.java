import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Student_JAVA {
	private String name;
	private int score;
	
	public Student_JAVA(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}



	public int getScore() {
		return score;
	}


	public static void main(String[] args) {
		int total = 0;
		List<Student_JAVA> list = Arrays.asList(
				new Student_JAVA("¿±ºº¿œ", 80),
				new Student_JAVA("±Ë»÷∂˜", 90),
				new Student_JAVA("º€¡æ√µ", 100),
				new Student_JAVA("∏∂∞«¿Õ", 80),
				new Student_JAVA("±ËΩ¬»Ø", 85),
				new Student_JAVA("¿Ãº“æ÷", 88)
				);
				
		
		Stream<Student_JAVA> stream = list.stream();
		double avg = stream.mapToInt(Student_JAVA::getScore)
				.average().getAsDouble();
		System.out.println(avg);
		
	}
}
