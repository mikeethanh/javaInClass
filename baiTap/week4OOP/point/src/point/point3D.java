package point;

public class point3D extends point2D{
	private int z;
	
	public point3D(int x, int y,int z) {
		super(x, y);
		this.setZ(z);
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "point3D [x=" + this.getX() + ", y=" + this.getY() + ", z=" + z + "]";
	}
	@Override
	public double distance() {
		double dx = this.getX()* this.getX();
		double dy = this.getY()* this.getY();
		double dz = this.getZ()* this.getZ();
		return Math.sqrt(dz + dy + dz);
	}
	
	
}
