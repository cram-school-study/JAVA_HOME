public class Ex63_class_Thread2 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		
		
		ThreadEx1 t1 = new ThreadEx1();
		Runnable r = new ThreadEx2();
		Thread t2 = new Thread(r);
		
		
		t1.start();
		t2.start();
		startTime = System.currentTimeMillis();
	
		for(int i=0; i< 500; i++) System.out.print("☆");
		for(int i=0; i< 500; i++) System.out.print("★");
		System.out.println("총 소요시간 - " + (System.currentTimeMillis()-startTime));
		
		
		}
}

class ThreadEx1 extends Thread {
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print("◇");
		}
		System.out.println("1 쓰레드 소요시간 - " + (System.currentTimeMillis()-Ex63_class_Thread2.startTime));
	}
}

class ThreadEx2 implements Runnable {
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.print("◆");
		}
		System.out.println("2 쓰레드 소요시간 - " + (System.currentTimeMillis()-Ex63_class_Thread2.startTime));
	}
}