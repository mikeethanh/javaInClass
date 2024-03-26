package main;

public class Circle implements Shape {
	private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double distance(Shape other) {
        if (other instanceof Circle) {
            Circle otherCircle = (Circle) other;
            return this.center.distance(otherCircle.center) - (this.radius + otherCircle.radius);
        }
        return -1; // Return -1 to indicate an invalid distance
    }

    @Override
    public void move(int deltaX, int deltaY) {
        this.center.move(deltaX, deltaY);
    }

    @Override
    public void rotate(double angle) {
        // Rotating a circle might involve rotating its center
    }

    @Override
    public void zoom(double factor) {
        this.radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }
	
}
