import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex66_class_ThreadDaemon3{
	public static void main(String[] args) {
		ThreadEx66_1 t1 = new ThreadEx66_1();
		List dasdaList = new LinkedList();

		t1.start();
		String input = JOptionPane.showInputDialog("�Է� ��Ź�ؿ� ~");
		System.out.println(input);
		
		System.out.println("������ - " + t1.isInterrupted());
		t1.interrupt();
		System.out.println("���� - " + t1.isInterrupted());
		
		System.out.println("main ����");
	}
}


class ThreadEx66_1 extends Thread {
	public void run() {
		int i = 10;
//		try {
			while(i !=0 && !isInterrupted()) {
				System.out.println(i--);
				System.out.println("������ - " + !isInterrupted());
				for (long x = 0; x<3000000000L; x ++) {
					x += 1;
				}
	
//				sleep(1000*1);	
			}
			System.out.println("ī��Ʈ�ٿ� ����");
//		} catch(InterruptedException e) {
//			System.out.println(e);
//		}
	}
}



