package inheritance.shape;
import java.lang.Object;
public class Rectangle implements Shape2D,Cloneable {

	public double l,b;		// SIDES OF RECTANGLE
	
	@Override				// OVERRIDING CLONEABLE
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
		Rectangle temp = (Rectangle)obj;
		return this.getArea()==temp.getArea();
	}
	@Override				// OVERRIDING TOSTRING
	public String toString()
	{
		return "area: "+ getArea() +"perimeter: "+ getPerimeter();
	}

	
	Rectangle(double L,double B)	// PARAMETERIZED CONSTRUCTOR
	{
		l=L;
		b=B;
	}
	
	public void resize(double L,double B)	// RESIZE FUNCTION
	{
		l=L;
		b=B;
	}
	
	public double getArea()		// TO GET AREA
	{
		return (l*b);
	}
	public double getPerimeter()	// TO GET PERIMETER
	{
		return (2*(l+b));
	}
	
	public void draw()				// DRAW FUNCTION
	{
		System.out.println("Area of Rectangle = "+ getArea() +"Perimeter of a Rectangle = "+ getPerimeter() );
	}

}
// END OF CLASS