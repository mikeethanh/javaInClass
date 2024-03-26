package point;

public class testPoint {
	public static void main(String[] args) {
		point2D a = new point2D(1,1);
		System.out.println(a.toString());
		System.out.println(a.distance());
		
		point3D b = new point3D(1,1,1);
		System.out.println(b.toString());
		System.out.println(b.distance());
	}
}
