package inheritance.shape;
import java.lang.Object;
public class Prism implements Shape3D,Cloneable {
	double a,b,c,h,cr,ba;	// SIDES OF BASE, HEIGHT, RECTANGLE AREA,
	
	@Override				// OVERRIDING CLONE
	public Object clone() {
		try {
			return super.clone();
	         }
	    catch (CloneNotSupportedException e) {
	         System.out.println("Shape: CloneNotSupportedException");
	         return null;
	       }
	   }

	@Override				// OVERRIDING EQUALS
	public boolean equals(Object obj)
	{
		Prism temp = (Prism)obj;
		return this.getSurfaceArea()==temp.getSurfaceArea();
	}
	@Override				// OVERRIDING TOSTRING
	public String toString()
	{
		return "surface area: "+ getSurfaceArea() +"volume: "+ getVolume();
	}

	
	Prism(double A,double B, double C,double H)	//PARAMETERIZED CONSTRUCTOR
	{
		a=A;
		b=B;
		c=C;
		h=H;
	}
	
	public void resize(double A,double B, double C,double H)	// RESIZE FUNCTION
	{
		a=A;
		b=B;
		c=C;
		h=H;
	}
	
	public double getSurfaceArea()		// FUNCTION TO GET SURFACE AREA
	{
		Triangle T = new Triangle(a,b,c);
		ba=T.getArea();
		ba=ba*2;
		Rectangle R1=new Rectangle(a,h);
		cr=R1.getArea();
		Rectangle R2=new Rectangle(b,h);
		cr=cr+R2.getArea();
		Rectangle R3=new Rectangle(c,h);
		cr=cr+R3.getArea();
		return (cr+ba);
	}
	public double getVolume()			// FUNCTION TO GET VOLUME
	{
		Triangle T = new Triangle(a,b,c);
		ba=T.getArea();
		return (ba*h);
	}
	
	public void draw()					// DRAW FUNCTION
	{
		System.out.println("Surface Area of Prism = "+ getSurfaceArea() +"Volume of a Prism = "+ getVolume() );
	}
}
// END OF CLASS