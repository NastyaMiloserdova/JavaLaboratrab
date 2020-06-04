import java.lang.Math;

class Point3d {
	private double xCoord;
	private double yCoord;
	private double zCoord;

	public Point3d (double x, double y, double z){
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}

	public double getX(){
		return xCoord;
	}

	public double getY(){
		return yCoord;
	}

	public double getZ(){
		return zCoord;
	}

	public void setX (double val){
		xCoord = val;
	}

	public void setY (double val){
		yCoord = val;
	}

	public void setZ (double val){
		zCoord = val;
	}

	public static boolean isEqual(Point3d val1, Point3d val2){
		if ((val1.getX() == val2.getX()) && (val1.getY() == val2.getY()) && (val1.getZ() == val2.getZ()))
			return true;
		else
			return false;
	}

	public static double distanceTo(Point3d val1, Point3d val2) {
		return Math.abs(Math.sqrt(Math.pow(val1.getX()-val2.getX(),2) + Math.pow(val1.getY()-val2.getY(),2) + Math.pow(val1.getZ()-val2.getZ(),2)));
	}

	// Периметр
	public static double compuleArea(Point3d val1, Point3d val2, Point3d val3) {
		double a,b,c;
		a = distanceTo(val1,val2);
		b = distanceTo(val2,val3);
		c = distanceTo(val3,val1);
		return a + b + c;
	}
	// Площадь
	public static double space(Point3d val1, Point3d val2, Point3d val3) {
		double a,b,c,p;
		a = distanceTo(val1,val2);
		b = distanceTo(val2,val3);
		c = distanceTo(val3,val1);
		p = (a + b + c) / 2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}