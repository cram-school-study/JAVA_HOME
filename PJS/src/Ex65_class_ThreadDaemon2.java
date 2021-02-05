public class Ex65_class_ThreadDaemon2{
	public static void main(String[] args) {
		ThreadEx65_1 t1 = new ThreadEx65_1();
		ThreadEx65_2 t2 = new ThreadEx65_2();
		
		t1.start();
		t2.start();
		
		try {
			t1.sleep(3*1000);
		} catch (InterruptedException e) {	
		}
		
		System.out.println("main 종료");
	}
}

class ThreadEx65_1 extends Thread {
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print("■");
		}
		System.out.println("쓰레드 1 종료");
	}
}

class ThreadEx65_2 extends Thread {
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print("□");
		}
		System.out.println("쓰레드 2 종료");
	}
}


