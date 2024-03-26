package main;

public class Line implements Shape{
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public double area() {
        return 0; // A line has no area
    }

    @Override
    public double perimeter() {
        return startPoint.distance(endPoint);
    }

    @Override
    public double distance(Shape other) {
        
        return -1; // Return -1 to indicate an invalid distance
    }

    @Override
    public void move(int deltaX, int deltaY) {
        startPoint.move(deltaX, deltaY);
        endPoint.move(deltaX, deltaY);
    }

    @Override
    public void rotate(double angle) {
        // Rotating a line might involve rotating its start and end points
    }

    @Override
    public void zoom(double factor) {
        // Zooming a line might involve zooming its start and end points
    }

    @Override
    public String toString() {
        return "Line [startPoint=" + startPoint + ", endPoint=" + endPoint + "]";
    }
}
