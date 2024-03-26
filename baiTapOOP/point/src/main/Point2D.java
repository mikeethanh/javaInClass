package main;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point2D other) {
    	double res = 0 ; 
    	res = Math.sqrt(Math.pow((other.getX() - this.x), 2) + Math.pow((other.getY() - this.y), 2));
        return res;
    }

    public Point2D symmetry() {
        return new Point2D(-x, -y);
    }

    @Override
    public String toString() {
        return "Point2D [x=" + x + ", y=" + y + "]";
    }
}