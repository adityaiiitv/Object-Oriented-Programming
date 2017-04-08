package inheritance.shape;
import java.lang.Object;
public class Circle implements Shape2D,Cloneable {

	public double r;				// RADIUS
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
		Circle temp = (Circle)obj;
		return this.getArea()==temp.getArea();
	}
	@Override						// OVERRIDING TOSTRING()
	public String toString()
	{
		return "area: "+ getArea() +"perimeter: "+ getPerimeter();
	}

	Circle()						// DEFAULT CONSTRUCTOR
	{
		r=0;
	}
	
	Circle(double R)				// PARAMETERIZED CONSTRUCTOR
	{
		r=R;
	}
	
	public void resize(double R)	// RESIZE FUNCTION
	{
		r=R;
	}
	
	public double getArea()		// FUNCTION TO GET AREA
	{
		return (PI*r*r);
	}
	public double getPerimeter()	// FUNCTION TO GET PERIMETER
	{
		return (2*PI*r);
	}
	
	public void draw()				// DRAW FUNCTION
	{
		System.out.println("Area of Circle = "+ getArea() +"Perimeter of a Circle = "+ getPerimeter() );
	}
}
// END OF CLASS