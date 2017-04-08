package inheritance.shape;
import java.lang.Object;

public class Pyramid implements Shape3D,Cloneable {

	private double l,b,h,ba;	// SIDES OF BASE RECTANGLE, HEIGHT, AREA OF BASE 
	@Override					// OVERRIDING CLONE
	public Object clone() {
		try {
			return super.clone();
	         }
	    catch (CloneNotSupportedException e) {
	         System.out.println("Shape: CloneNotSupportedException");
	         return null;
	       }
	   }

	@Override					// OVERRIDING EQUALS
	public boolean equals(Object obj)
	{
		Pyramid temp = (Pyramid)obj;
		return this.getSurfaceArea()==temp.getSurfaceArea();
	}
	@Override					// OVERRIDING TOSTRING
	public String toString()
	{
		return "surface area: "+ getSurfaceArea() +"volume"+ getVolume();
	}
	
	Pyramid(double L,double B,double H)	// PARAMETERIZED CONSTRUCTOR
	{
		l=L;
		b=B;
		h=H;
	}
	
	public void resize(double L,double B,double H)	// RESIZE FUNCTION
	{
		l=L;
		b=B;
		h=H;
	}
	
	public double getSurfaceArea()	// TO GET SURFACE AREA
	{
		Rectangle R= new Rectangle(l,b);
		ba=R.getArea();
		double temp=(Math.sqrt((l*l)+(b*b)))/2;
		double side=Math.sqrt((temp*temp)+(h*h));
		Triangle T=new Triangle(l,side,side);
		Triangle T1=new Triangle(b,side,side);
		return (ba+(2*T.getArea())+(2*T1.getArea()));
	}
	public double getVolume()	// TO GET VOLUME
	{
		return ((l*b*h)/3);
	}
	
	public void draw()			// DRAW FUNCTION
	{
		System.out.println("Surface Area of Pyramid = "+ getSurfaceArea() +"Volume of a Pyramid = "+ getVolume() );
	}
}
// END OF CLASS