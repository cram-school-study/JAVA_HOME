public class Ex011_Radio_Class {
	public static void main(String[] args) {
		Radio r1 = new Radio();
		Radio r2 = new Radio(true, 10.0f, "t_map");
		
		System.out.println("r1.power-"+r1.power+", r1.fm-"+r1.fm+", r1.navi-"+r1.navi+"r1.brand-"+r1.brand);
		System.out.println("r2.power-"+r2.power+", r2.fm-"+r2.fm+", r2.navi-"+r2.navi+"r2.brand-"+r2.brand);
		Radio.what_brand();
	}
}


class Radio {
	boolean power;
	float fm;
	String navi;
	static String brand = "현대";
	
	Radio() {
		power = false;
		fm = 91.9f;
		navi = "아이나비";
	}
	Radio(boolean power, float fm, String navi) {
		this.power = power;
		this.fm = fm;
		this.navi = navi;
	}
	
	void power_on_off() { power = !power; }
	void fm_up() { fm += 0.1; }
	void fm_down() { fm -= 0.1; }
	
	static void what_brand() {
		System.out.println("현대차만 팝니다.~");
	}
}