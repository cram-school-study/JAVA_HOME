import java.util.Comparator;
import java.util.stream.Stream;

public class Ex73_class_FunctionPackage4 {

	public static void main(String[] args) {
		Stream<Studentaa> studentStream = Stream.of(
				new Studentaa("이자바", 3, 300),
				new Studentaa("김자바", 1, 200),
				new Studentaa("안자바", 2, 100),
				new Studentaa("박자바", 2, 150),
				new Studentaa("소자바", 1, 200),
				new Studentaa("나자바", 3, 290),
				new Studentaa("감자바", 3, 180)
			);
		
		studentStream.sorted(Comparator.comparing(Studentaa::getBan).reversed().thenComparing(Studentaa::getTotalScore)).forEach(System.out::println);
		
//		studentStream.sorted(Comparator.comparing(Student::getBan) // 반별 정렬
//		 	.thenComparing(Comparator.naturalOrder()))     	// 기본 정렬
//			.forEach(System.out::println);
	}
}

class Studentaa implements Comparable<Studentaa> {
	String name;
	int ban;
	int totalScore;
	Studentaa(String name, int ban, int totalScore) { 
		this.name =name;
		this.ban =ban;
		this.totalScore =totalScore;
	}
	
	public String toString() { 
		return String.format("[%s, %d, %d]", name, ban, totalScore); 
	}
	
	String getName()     { return name;}
	int getBan()         { return ban;}
	int getTotalScore()  { return totalScore;}
	
	// 총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Studentaa s) {
		return s.totalScore - this.totalScore;
	}
}

















