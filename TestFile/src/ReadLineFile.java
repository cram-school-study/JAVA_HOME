import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ReadLineFile {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\JAVA_HOME\\TestFile\\src\\단어장.txt");
		Map<String, String> map = new HashMap<String, String>();
		boolean exit_toogle = false;
		int[] random = new int[5];

		
		if(file.exists()) {
			BufferedReader inFile = new BufferedReader(new FileReader(file));
			String strLine = null;
			while( (strLine = inFile.readLine()) != null ) {
				String[] line = strLine.split(" +");
				map.put(line[0], line[1]);
			}
			inFile.close();
			
			for(int i=0;i<5;i++) {
//				for(int j=0; j<i; j++) {
//					
//				}
				random[i] = (int)((Math.random()*(map.size())));
			}
		}
		
		while(true) {
			if(exit_toogle == true) break;
			
			System.out.println("1 - 영어 단어 입력하면 뜻 보기");
			System.out.println("2 - 뜻 보기 보고 단어 입력");
			System.out.println("3 - 나가기");
			
			Scanner scan = new Scanner(System.in);
			int input_number = scan.nextInt();
			
			if(input_number == 1) {
				System.out.println("영어단어를 입력하시오 뜻이 나옵니다요(나가는건 q)");
				
				while(true) {
					System.out.print("단어 : ");
					String input = scan.next();
										
					if(map.containsKey(input)) {
						System.out.printf("%s - %s", input, map.get(input));
						System.out.println();
					}else System.out.println("해당 단어는 단어장에 없습니다.");
					
					if(input.equals("q")) {
						exit_toogle = true;
						break;
					}
				}
				
				System.out.println("잘가~");
			}else if(input_number == 2){
				int cnt = 0;
				int susscess =0;
				String[] moon = new String[map.size()];
				Iterator<String> it = map.keySet().iterator();
				
				while(it.hasNext()) {
					moon[cnt] = it.next();
					cnt++;
				}
				
				System.out.println("단어 보고 뜻 입력");
				System.out.println("--------------문제 스타트--------------");
				
				for(int i=0; i<random.length; i++) {
					System.out.print(map.get(moon[random[i]])+" - ");
					String input = scan.next();
					if(input.equals(moon[random[i]])) {
						susscess++;
					}
				}
				
				System.out.println("--------------문제 끝!--------------");
				
				System.out.println(susscess*20 +"점");
			}else if(input_number == 3){
				exit_toogle = true;
			}else {
				System.out.println("제대로 입력하십시다요");
			}
		}
	}
}
