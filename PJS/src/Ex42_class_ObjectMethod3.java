import java.util.Objects;

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPACE", 1);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind-"+kind+", number-"+number;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
//		result = prime * result + number;
//		return result;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Card other = (Card) obj;
//		if (kind == null) {
//			if (other.kind != null)
//				return false;
//		} else if (!kind.equals(other.kind))
//			return false;
//		if (number != other.number)
//			return false;
//		return true;
//	}
	
	public int hashCode() {
		return Objects.hash(kind, number);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card card = (Card)obj;
			return this.kind.equals(card.kind) && this.number == card.number;
		}else {
			return false;
		}
	}
}


public class Ex42_class_ObjectMethod3 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.kind);
		System.out.println(c1.number);
		
		System.out.println(c1.equals(c2));
	}
}
