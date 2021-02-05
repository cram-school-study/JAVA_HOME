package jwj;

import jwj1.MyParent20;

class MyParent extends MyParent20 {
	
	public void printMembers() {
//		System.out.println(prv);
//		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}

}

public class Exam20_class_acces_mofifier {

	public static void main(String[] args) {
			MyParent parent = new MyParent();
					
//			System.out.println(parent.prv);
//			System.out.println(parent.dft);
//			System.out.println(parent.prt);
			System.out.println(parent.pub);
	}

}
