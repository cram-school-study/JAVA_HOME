import javax.swing.JOptionPane;

public class Ex62_class_Thread {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx1_3 t1 = new ThreadEx1_3();
		t1.start();
		
		String inputString = JOptionPane.showInputDialog("�Է� �޽��� ��Ź");
		System.out.println("�Է��� �޽����� '" + inputString + "'�Դϴ�.");
	}
}

class ThreadEx1_3 extends Thread {
	public void run() {
		for(int i=20; i>0; i--) {
			System.out.println("������������< " + i + " >������������");
			try {
				sleep(1000);
			} catch (Exception e) {

			}
		}
	}
}