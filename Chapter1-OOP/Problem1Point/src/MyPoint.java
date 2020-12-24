
public class MyPoint implements Point{
	private double x,y;
	/*
	 In Java, all non-static methods are based on the runtime type of the
	  underlying object rather than the type of the reference that points to that object.
	  Therefore, it doesn’t matter which type you use in the declaration of the object,
	   the behavior will be the same.
	   https://www.geeksforgeeks.org/referencing-subclass-objects-subclass-vs-superclass-reference/
	 */
	public static final Point ORIGIN=new MyPoint();
	
	public MyPoint() {
		
	}
	
	public MyPoint(double x, double y) {
		if(x==0.0&&y==0.0)
			throw new RuntimeException("use Point.ORIGIN");
		this.x=x;
		this.y=y;
	}
	
	@Override
	public double amplitude() {
		
		return Math.atan(y/x);
	}

	@Override
	public double distanceTo(Point o) {
		if(o==this) {
			return 0.0;
		}else if(!(o instanceof Point)) {
			throw new RuntimeException("Not a Point");
		}else {
			MyPoint p = (MyPoint)o;
			double xp=p.x - this.x;
			double yp = p.y-this.y;
			return Math.sqrt((xp*xp)+(yp*yp));
		}
		
	}

	@Override
	public boolean equals(Point o) {
		if(o==this) {
			return true;
		}else if(!(o instanceof Point)) {
			throw new RuntimeException("Not a Point");
		}else {
			MyPoint p =(MyPoint) o;
			return (p.x==this.x)&&(p.y==this.y);
		}
		
	}

	@Override
	public double magnitude() {
		
		return Math.sqrt((x*x)+(y*y));
	}

	@Override
	public double xCoordinate() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double yCoordinate() {
		// TODO Auto-generated method stub
		return y;
	}
	
	@Override
	public String toString() {
		
		return "("+x+","+y+")";
	}
}
