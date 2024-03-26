package main;

public class Rectangle implements Shape {
	 private Point topLeft;
	    private double width;
	    private double height;

	    public Rectangle(Point topLeft, double width, double height) {
	        this.topLeft = topLeft;
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    public double area() {
	        return width * height;
	    }

	    @Override
	    public double perimeter() {
	        return 2 * (width + height);
	    }

	    @Override
	    public double distance(Shape other) {
	        return -1; // Return -1 to indicate an invalid distance
	    }

	    @Override
	    public void move(int deltaX, int deltaY) {
	    }

	    @Override
	    public void rotate(double angle) {
	        // Rotating a rectangle might involve rotating its top-left corner
	    }

	    @Override
	    public void zoom(double factor) {
	        width *= factor;
	        height *= factor;
	    }

	    @Override
	    public String toString() {
	        return "Rectangle [topLeft=" + topLeft + ", width=" + width + ", height=" + height + "]";
	    }	
}
