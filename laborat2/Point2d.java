class Point2d {
	private double xCoord;
	private double yCoord;


	public Point2d (double x, double y){
		xCoord = x;
		yCoord = y;
	}


	public double getX (){
		return xCoord;
	}


	public double getY (){
		return yCoord;
	}


	public void setX (double val){
		xCoord = val;
	}


	public void setY (double val){
		yCoord = val;
	}


	public static boolean isEqual (Point2d val1, Point2d val2) {
		if ((val1.getX() == val2.getX()) && (val1.getY() == val2.getY()))
			return true;
		else
			return false;
	}
}