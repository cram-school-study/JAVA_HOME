import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException{
		String oriFileName = "C:\\Users\\JWJ\\Desktop\\1.jpg";
		String targetFileName = "C:\\Users\\JWJ\\Desktop\\바탕화면\\수업파일\\2.jpg";
		
		
		FileInputStream fis = new FileInputStream(oriFileName); 
		// exe, jpg, mp3 파일 다룰때 FileInputStream
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		
		while( (readByteNo = fis.read(readBytes)) != -1 ) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fis.close();
		fos.close();
		
		System.out.println("파일복사완료");
	}
}
