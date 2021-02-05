//����ƽ Ŭ������ �����ϴ�.
enum Direction { 
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private static final Direction[] Darr = Direction.values();
	private final int value;
	private final String symbol;
	
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol = symbol;
	}
	
	// private ������ �ְ� �������� �޼��带 �̿��ؾ� �Ѵ�.
	public int getValue() {
		return this.value;
	}
	
	public String getSymbol() {
		return this.symbol;
	}
	
	public static Direction of(int dir) {
		if(dir < 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value");
		}
		return Darr[dir-1];
	}
	
	public Direction rotate(int num) {
		num = num % 4;
		if(num<0) num += 4;
		return Darr[(value-1+num)%4];
	}
	
	public String toString() {
		return name()+" " +getSymbol();
	}
}


public class Ex59_class_Enum {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST; //setting �ϴ� ��� 1����
		Direction d2 = Direction.valueOf("WEST"); //setting �ϴ� ��� 2����
		Direction d3 = Direction.valueOf(Direction.class, "EAST"); //setting �ϴ� ��� 3����
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println(d1 == d3);
		System.out.println(d1.ordinal());
		System.out.println(d2.ordinal());
		System.out.println(d3.compareTo(d2));
		
		Direction[] dArray = Direction.values();
		
		for(Direction d : dArray) {
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
		}
		
		
		for(Direction d : Direction.values()) {
			System.out.printf("%s, %d, %s%n", d.name(), d.getValue(), d.getSymbol());
		}
		
		Direction dd1 = Direction.EAST;
		Direction dd2 = Direction.of(1);
		
		System.out.println(dd1==dd2);
		System.out.println(Direction.EAST.rotate(1));
		
	}

}
