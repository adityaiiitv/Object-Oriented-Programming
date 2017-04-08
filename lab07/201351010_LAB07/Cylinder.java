package inheritance.shape;
import java.lang.Object;
public class Cylinder implements Shape3D,Cloneable {

	double r,h;						// RADIUS AND HEIGHT
	public double PI = 3.14159;
	
	@Override						// OVERRIDING CLONE()
	public Object clone() {
		try {
			return super.clone();
	         }
	    catch (CloneNotSupportedException e) {
	         System.out.println("Shape: CloneNotSupportedException");
	         return null;
	       }
	   }

	@Override						// OVERRIDING EQUALS()
	public boolean equals(Object obj)
	{
		Cylinder temp = (Cylinder)obj;
		return this.getSurfaceArea()==temp.getSurfaceArea();
	}
	@Override						// OVERRIDING TOSTRING
	public String toString()
	{
		return "surface area: "+ getSurfaceArea() +"volume: "+ getVolume();
	}

	
	Cylinder(double R,double H)	// PARAMETERIZED CONSTRUCTOR
	{
		r=R;
		h=H;
	}
	
	public void resize(double R,double H)	// RESIZE FUNCTION
	{
		r=R;
		h=H;
	}
	
	public double getSurfaceArea()	// TO GET THE SURFACE AREA
	{
		return ((2*PI*r*h)+(4*PI*r));
	}
	
	public double getVolume()		// TO GET THE VOLUME
	{
		return (PI*r*r*h);
	}
	
	public void draw()				// DRAW FUNCTION
	{
		System.out.println("Surface Area of Cylinder = "+ getSurfaceArea() +"Volume of a Cylinder = "+ getVolume() );
	}
	
}
// END OF CLASS