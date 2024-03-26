package main;

import java.io.Serializable;
import java.util.Objects;

public class Point2D implements Serializable {
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

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}
}