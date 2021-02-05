import java.util.ArrayList;

public class Ex55_class_GenericType {

	public static void main(String[] args) {
		 ArrayList<Integer> lst = new ArrayList<Integer>();
		 lst.add(10);
		 lst.add(20);
		 lst.add(30);
//		 lst.add("10");
		 
		 ArrayList lst1 = new ArrayList();
		 lst1.add(11);
		 lst1.add("11");
		 
		 System.out.println(lst);
		 System.out.println(lst1);
//		 System.out.println((Integer)lst1.get(1)); // runtime에서 에러남
	}

}
