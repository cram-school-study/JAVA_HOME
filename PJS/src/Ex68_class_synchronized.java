public class Ex68_class_synchronized {

	public static void main(String[] args) {
		Runnable r = new RunnableEx68();
		Thread th1 = new Thread(r);
		th1.start();
		
		new Thread(r).start();
		
		
		

	}
}

class Account {
	private int balance = 1000;
	
	public synchronized int getBalance() {
		return this.balance;
	}
	
	public synchronized void withdraw (int money) {
		while(balance < money) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		balance -= money;
		
//		if(balance >= money) {
//			try {
//				Thread.sleep(1000);
//			} catch(InterruptedException e){
//				
//			}
//			balance -= money;
//		}
	}
	
	public synchronized void depoit(int money) {
		balance += money;
		notify();
		
//		if(money > 0) {
//			balance += money;
//		}
	}
}

class RunnableEx68 implements Runnable {
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random() * 2 + 1) * 100;
			acc.depoit(money);
			System.out.println("현재 입금 후 잔액은 " + acc.getBalance());
			
			money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("현재 잔액은 " + acc.getBalance());
		}
	}
	
}