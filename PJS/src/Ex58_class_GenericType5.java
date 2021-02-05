import java.util.ArrayList;
import java.util.List;

interface Eatable2 {}

class Fruit2 implements Eatable2 {
	public String toString() {return "Fruit";}
}

class Apple2 extends Fruit2 {
	public String toString() {return "Apple";}
}

class Grape2 extends Fruit2 {
	public String toString() {return "Grape";}
}

class Toy2 {
	public String toString() {return "Toy";}
}

class Box2<T> {
	
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T getT(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
	ArrayList<T> getList() {return list;}
	
}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Juice {
	String name;
	
	Juice(String name) {
		this.name = name + "Juice"; 
	}
	public String toString() { return name; }
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2>box2) {
		String tmp = "";
		
		for (Fruit2 f: box2.getList() ) tmp += f+ " ";
		return new Juice(tmp);
	}
}


public class Ex58_class_GenericType5 {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		Integer aInteger =1;
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		fruitBox.add(new Fruit2());
		
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(appleBox);
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		
		
	}
}

