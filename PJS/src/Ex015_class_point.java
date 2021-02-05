class Point2D {
	int x;
	int y;
	
	String getLocation() {
		return "x:"+ x + ", y:" + y;
	}
	
	public String toString() {
		return "x:"+ x + ", y:" + y;
	}
}

class Point3D extends Point2D {
	int z;
	
	String getLocation() {
		//return "x :"+ x + ", y:" + y + ", z:" + z;
		return super.getLocation()+", z:" + z;
	}
	
	public String toString() {
		//return "x :"+ x + ", y:" + y + ", z:" + z;
		return super.toString()+", z:" + z;
	}
}

public class Ex015_class_point {
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point3D p2 = new Point3D();
		
		p1.x = 10;
		p1.y = 10;
		System.out.println(p1.getLocation());
		System.out.println(p1.toString());
		
		p2.x = 20;
		p2.y = 20;
		p2.z = 20;
		System.out.println(p2.getLocation());
		System.out.println(p2.toString());
	}
}
