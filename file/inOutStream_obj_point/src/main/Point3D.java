package main;

public class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public double distance(Point3D other) {
        return Math.sqrt(Math.pow((other.getX() - this.getX()), 2) + Math.pow((other.getY() - this.getY()), 2)
                + Math.pow(this.z - other.getZ(), 2));
    }

    @Override
    public Point3D symmetry() {
    	Point3D res = new Point3D(-this.getX(), -this.getY(), -z);
        return res;
    }

    @Override
    public String toString() {
        return "Point3D [x=" + getX() + ", y=" + getY() + ", z=" + z + "]";
    }
}
