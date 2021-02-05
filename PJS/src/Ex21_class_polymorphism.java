abstract class Player { // �߻� Ŭ���� - �߻� �޼��尡 �Ѱ��� �־�� �߻� Ŭ������ �Ǵ� ��.
	abstract void play(int position); // �޼��� ����θ� �ְ�, �ٵ�(������)�� ���� �߻� �޼���
	abstract void stop();
}

// �߻� Ŭ������ ����� ���ؼ� �׸��� �޼��尡 �ϼ��Ǿ�� ��ü�� �� �ν��Ͻ�ȭ�� �ȴ�.
class AudioPlayer extends Player {
	@Override
	void play(int position) {
		System.out.println(position + "�������κ��� play�մϴ�.");
	}
	@Override
	void stop() {
		System.out.println("play�� ����ϴ�.");
	}
}


public class Ex21_class_polymorphism {
	public static void main(String[] args) {
//		Player p = new Player(); // �߻� Ŭ������ �ν��Ͻ�ȭ�� �� ����.
		AudioPlayer ap = new AudioPlayer(); 
		// ������ �����Ѱ��̴�. ��, player�� �߻�ȭ Ŭ����������,
		// ��ӵ� AudioPlayer���� �����Ǹ� �Ϸ��߱� ������, �ν��Ͻ�ȭ�� �����ϴ�.
		// �������� ��ǥ���� ���̹Ƿ� �����ص� ��!
		ap.play(100);
		ap.stop();
	}
}
