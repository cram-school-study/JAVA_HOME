public class Ex67_class_Thread_deprecated{
	public static void main(String[] args) {		
		JwjThread th1 = new JwjThread("Thread1#1");
		JwjThread th2 = new JwjThread("Thread2#2");
		JwjThread th3 = new JwjThread("Thread3#3");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2*1000);
			th1.suspend();
			Thread.sleep(2*1000);
			th2.suspend();
			
			Thread.sleep(3*1000);
			th1.resume();
			Thread.sleep(3*1000);
			th1.stop();
			th2.stop();
			
			Thread.sleep(3*1000);
			th3.stop();
		} catch (InterruptedException e) {
			
		}
	}
}

class RumImpEx67 implements Runnable {
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
		}
	}
}

class ThreadEx67 extends Thread {
	public void run() {
		int i = 10;
		while(i!=0) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("카운트 다운 종료 ......");
	}
}

class JwjThread implements Runnable {
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	// volatile -> 메모리에 있는것 반드시 참조하도록
	
	Thread th;
	
	JwjThread() {}
	JwjThread(String name) {
		th = new Thread(this, name);
	}
	
	void start() {
		th.start();
	}
	
	void resume() {
		suspended = false;
	}
	
	void suspend() {
		suspended = true;
		th.interrupt();
	}
	
	void stop() {
		stopped = true;
		th.interrupt();
	}
	
	public void run() {
		while(!stopped) {
			if(! suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {			
					
				}
			}else {
				Thread.yield();
			}
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
