import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadChar {

	public static void countChar(String[] args) {
		int charChar = 0; // ���Ͽ��� char������ �д´�. �ڷ� Ÿ���� ��Ƽ��
		int charCnt = 0; // ���Ͽ� �ִ� ������ ���ڼ�
		int spaceCnt = 0; // ���Ͽ� ����ִ� �����̽� ���� ��
		
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
		
		System.out.print("\r Test.txt�� �ִ� ������: " + spaceCnt);
		System.out.print("\r Test.txt�� �ִ� ���ڼ���: " + charCnt);
		System.out.print("\r Test.txt�� �ִ� �� ���ڼ���: " + (spaceCnt + charCnt));

	}

}
