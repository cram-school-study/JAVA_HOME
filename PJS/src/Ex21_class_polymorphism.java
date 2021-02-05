abstract class Player { // 추상 클래스 - 추상 메서드가 한개라도 있어야 추상 클래스가 되는 것.
	abstract void play(int position); // 메서드 선언부만 있고, 바디(구현부)가 없는 추상 메서드
	abstract void stop();
}

// 추상 클래스는 상속을 통해서 그리고 메서드가 완성되어야 객체가 즉 인스턴스화가 된다.
class AudioPlayer extends Player {
	@Override
	void play(int position) {
		System.out.println(position + "지점으로부터 play합니다.");
	}
	@Override
	void stop() {
		System.out.println("play를 멈춥니다.");
	}
}


public class Ex21_class_polymorphism {
	public static void main(String[] args) {
//		Player p = new Player(); // 추상 클래스는 인스턴스화할 수 없다.
		AudioPlayer ap = new AudioPlayer(); 
		// 다형성 지원한것이다. 즉, player는 추상화 클래스였지만,
		// 상속된 AudioPlayer에서 재정의를 완료했기 때문에, 인스턴스화가 가능하다.
		// 다형성의 대표적인 예이므로 생각해둘 것!
		ap.play(100);
		ap.stop();
	}
}
