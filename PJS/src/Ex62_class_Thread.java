import javax.swing.JOptionPane;

public class Ex62_class_Thread {
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadEx1_3 t1 = new ThreadEx1_3();
		t1.start();
		
		String inputString = JOptionPane.showInputDialog("입력 메시지 부탁");
		System.out.println("입력한 메시지는 '" + inputString + "'입니다.");
	}
}

class ThreadEx1_3 extends Thread {
	public void run() {
		for(int i=20; i>0; i--) {
			System.out.println("♣♣♣♣♣♣< " + i + " >♣♣♣♣♣♣");
			try {
				sleep(1000);
			} catch (Exception e) {

			}
		}
	}
}