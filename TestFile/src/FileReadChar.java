import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadChar {

	public static void countChar(String[] args) {
		int charChar = 0; // 파일에서 char단위로 읽는다. 자료 타입은 인티저
		int charCnt = 0; // 파일에 있는 문자의 글자수
		int spaceCnt = 0; // 파일에 들어있는 스페이스 문자 수
		
		try {
			FileReader fileReader = new FileReader("C:\\Users\\JWJ\\Desktop\\Test.txt");
			while (( charChar=fileReader.read()) != -1 ) {
				if(charChar == 32) { spaceCnt++; }
				if(charChar != 32) { charCnt++; }
			}
			fileReader.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("\r Test.txt에 있는 공백은: " + spaceCnt);
		System.out.print("\r Test.txt에 있는 문자수는: " + charCnt);
		System.out.print("\r Test.txt에 있는 총 문자수는: " + (spaceCnt + charCnt));

	}

}
