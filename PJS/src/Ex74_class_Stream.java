import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex74_class_Stream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("이용원", "고은서", "정원준", "김혜은", "이택영", "김휘람");
		//순차처리
		Stream<String> stream = list.stream();
//		Stream<String> parallStream = list.parallelStream();
		
//		stream.forEach(s -> print(s));
//		stream.forEach(Ex74_class_Stream::print);
		
//		parallStream.forEach(Ex74_class_Stream::print);
		
		IntStream intStream = new Random().ints(1,46);
//		intStream.forEach(i -> System.out.print(i + ","));
//		intStream.distinct().limit(6).sorted().forEach( System.out::print);
//		intStream.filter(i-> i==30).limit(1).close();
		intStream.distinct().limit(6);
		
	}
	
	public static void print(String str) {
		System.out.println(str + ":" + Thread.currentThread().getName());
	}
}
