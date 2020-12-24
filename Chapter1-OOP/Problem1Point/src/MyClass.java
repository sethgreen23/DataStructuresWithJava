
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = MyPoint.ORIGIN;
		Point p1 = new MyPoint(4,5);
		Point p2 = new MyPoint(1,2);
		Point p3= new MyPoint(7,8);
		Point p4 = new MyPoint(1,2);
		
		System.out.println(p+" equals "+p1+" ? "+p.equals(p1));
		System.out.println(p1+" equals "+p3+" ? "+p1.equals(p3));
		System.out.println(p2+" equals "+p4+" ? "+p2.equals(p4));
		System.out.println("The magnitude  of the Point "+p2+" is "+p2.magnitude());
		System.out.println("The amplitude  of the Point "+p2+" is "+p2.amplitude());
		System.out.println("The distance of "+p+" to the Point "+p2+" is "+p.distanceTo(p2));
	}

}
