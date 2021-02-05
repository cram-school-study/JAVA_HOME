import java.util.*;
import java.util.stream.*;

class Ex14_7 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
			new String[]{"abc", "def", "jkl"},
			new String[]{"ABC", "GHI", "JKL"}
		);

//		Stream<Stream<String>> strStrm = strArrStrm.map(Arrays::stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

		strStrm.map(String::toLowerCase)
			   .distinct()
			   .sorted()
			   .forEach(System.out::println);
		System.out.println();

		String[] lineArr = {
			"Believe or not It is true",
			"Do or do not There is no try",
		};

		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +"))) // " +" - 정규식 나누기
			.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
		
		String str = "There are four seasson in a year.";
		Stream<String> strStream = Stream.of(str);
		strStream.map(line -> line.split(" +")).forEach(s->System.out.println(s));
		
		strStream.flatMap(line -> Stream.of(line.split(" +")))
		.map(String::toUpperCase)
		.distinct().forEach(s->System.out.println(s));
		
	}
}