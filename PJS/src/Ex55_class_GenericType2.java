public class Ex55_class_GenericType2 {

	public static void main(String[] args) {
		Box<String> frultbox = new Box<String>();
		
		frultbox.setItem("apple");
		System.out.println(frultbox.getItem());
	}

}

class Box<JWJ> {
	JWJ item;
	void setItem(JWJ item) { this.item = item; }
	JWJ getItem() {return item;}
}
