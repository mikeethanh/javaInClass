package main;

public class Point implements Shape {
	private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return 0; // A point has no area
    }

    @Override
    public double perimeter() {
        return 0; // A point has no perimeter
    }

    @Override
    public double distance(Shape other) {
        if (other instanceof Point) {
            Point otherPoint = (Point) other;
            return Math.sqrt(Math.pow((otherPoint.x - this.x), 2) + Math.pow((otherPoint.y - this.y), 2));
        }
        return -1; // Return -1 to indicate an invalid distance
    }

    @Override
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    @Override
    public void rotate(double angle) {
        // Rotating a point doesn't change its coordinates
    }

    @Override
    public void zoom(double factor) {
        // Zooming a point doesn't change its coordinates
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
