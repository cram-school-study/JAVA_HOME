import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() {return "Fruit";}
}

class Apple extends Fruit {
	public String toString() {return "Apple";}
}

class Grape extends Fruit {
	public String toString() {return "Grape";}
}

class Toy {
	public String toString() {return "Toy";}
}

interface Eatable {}

class FruitBox<T extends Fruit & Eatable> extends Box1<T> {}

class Box1<T> {
	
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T getT(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
	
}


public class Ex56_class_GenericType3 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
//		FruitBox<Grape> aplgrapeBox = new FruitBox<Apple>();
//		FruitBox<Toy> aplgrapeBox = new FruitBox<Toy>();
//		FruitBox<Fruit> test = new Box1<Fruit>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
//		fruitBox.add(new Toy());
//		appleBox.add(new Fruit());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox - "+ fruitBox);
		System.out.println("appleBox - "+ appleBox);
		System.out.println("grapeBox - "+ grapeBox);
		
		
		
		
		
		
		
		
		
	}
}

