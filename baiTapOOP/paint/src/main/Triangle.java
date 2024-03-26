package main;

public class Triangle implements Shape {
	  private Point vertex1;
	    private Point vertex2;
	    private Point vertex3;

	    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
	        this.vertex1 = vertex1;
	        this.vertex2 = vertex2;
	        this.vertex3 = vertex3;
	    }

	    @Override
	    public double area() {
	        // Sử dụng công thức Heron để tính diện tích tam giác
	        double a = vertex1.distance(vertex2);
	        double b = vertex2.distance(vertex3);
	        double c = vertex3.distance(vertex1);

	        double s = (a + b + c) / 2;
	        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    }

	    @Override
	    public double perimeter() {
	        return vertex1.distance(vertex2) + vertex2.distance(vertex3) + vertex3.distance(vertex1);
	    }

	    @Override
	    public double distance(Shape other) {
	        if (other instanceof Triangle) {
	            Triangle otherTriangle = (Triangle) other;
	            return Math.min(
	                    Math.min(vertex1.distance(otherTriangle.vertex1), vertex1.distance(otherTriangle.vertex2)),
	                    vertex1.distance(otherTriangle.vertex3)
	            );
	        }
	        return -1; // Return -1 to indicate an invalid distance
	    }

	    @Override
	    public void move(int deltaX, int deltaY) {
	        vertex1.move(deltaX, deltaY);
	        vertex2.move(deltaX, deltaY);
	        vertex3.move(deltaX, deltaY);
	    }

	    @Override
	    public void rotate(double angle) {
	        // Rotating a triangle might involve rotating its vertices
	    }

	    @Override
	    public void zoom(double factor) {
	        // Zooming a triangle might involve zooming its vertices
	    }

	    @Override
	    public String toString() {
	        return "Triangle [vertex1=" + vertex1 + ", vertex2=" + vertex2 + ", vertex3=" + vertex3 + "]";
	    }
}
