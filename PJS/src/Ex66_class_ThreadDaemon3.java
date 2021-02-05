import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex66_class_ThreadDaemon3{
	public static void main(String[] args) {
		ThreadEx66_1 t1 = new ThreadEx66_1();
		List dasdaList = new LinkedList();

		t1.start();
		String input = JOptionPane.showInputDialog("입력 부탁해요 ~");
		System.out.println(input);
		
		System.out.println("쓰기전 - " + t1.isInterrupted());
		t1.interrupt();
		System.out.println("쓴후 - " + t1.isInterrupted());
		
		System.out.println("main 종료");
	}
}


class ThreadEx66_1 extends Thread {
	public void run() {
		int i = 10;
//		try {
			while(i !=0 && !isInterrupted()) {
				System.out.println(i--);
				System.out.println("쓰레드 - " + !isInterrupted());
				for (long x = 0; x<3000000000L; x ++) {
					x += 1;
				}
	
//				sleep(1000*1);	
			}
			System.out.println("카운트다운 종료");
//		} catch(InterruptedException e) {
//			System.out.println(e);
//		}
	}
}



