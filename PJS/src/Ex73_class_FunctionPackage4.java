import java.util.Comparator;
import java.util.stream.Stream;

public class Ex73_class_FunctionPackage4 {

	public static void main(String[] args) {
		Stream<Studentaa> studentStream = Stream.of(
				new Studentaa("���ڹ�", 3, 300),
				new Studentaa("���ڹ�", 1, 200),
				new Studentaa("���ڹ�", 2, 100),
				new Studentaa("���ڹ�", 2, 150),
				new Studentaa("���ڹ�", 1, 200),
				new Studentaa("���ڹ�", 3, 290),
				new Studentaa("���ڹ�", 3, 180)
			);
		
		studentStream.sorted(Comparator.comparing(Studentaa::getBan).reversed().thenComparing(Studentaa::getTotalScore)).forEach(System.out::println);
		
//		studentStream.sorted(Comparator.comparing(Student::getBan) // �ݺ� ����
//		 	.thenComparing(Comparator.naturalOrder()))     	// �⺻ ����
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
	
	// ���� ���������� �⺻ ���ķ� �Ѵ�.
	public int compareTo(Studentaa s) {
		return s.totalScore - this.totalScore;
	}
}

















