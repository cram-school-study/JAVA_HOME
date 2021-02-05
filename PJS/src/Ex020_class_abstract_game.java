abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {};
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("마린이 좌표 ["+ x +","+ y +"]으로 이동합니다.");
		System.out.println("스타일은 지상군 보병 스타일로....");
	}
	
	void stimPack() {
		System.out.println("스팀팩은 일종의 마약이다. ㅋㅋㅋㅋ");
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("탱크가 좌표 ["+ x +","+ y +"]으로 이동합니다.");
		System.out.println("스타일은 지상군 보병 스타일로....");
	}
	
	void changeMode() {
		System.out.println("시즈모드와 일반모드 토글");
	}
}

class dropShip extends Unit {
	void move(int x, int y) {
		System.out.println("드랍쉽의 좌표 ["+ x +","+ y +"]으로 이동합니다.");
		System.out.println("스타일은 공중 수송선 스타일로....");
	}
	
	void load() {
		System.out.println("병력이 상차합니다.");
	}
	
	void unload() {
		System.out.println("병력이 하차합니다.");
	}
}


public class Ex020_class_abstract_game {

	public static void main(String[] args) {
		Unit[] units = new Unit[3];
		units[0] = new Marine();
		units[1] = new Tank();
		units[2] = new dropShip();
		
		for(int i=0;i<units.length;i++) {
			units[i].move(500, 500);
		}
		
	}

}
