package inheritance.shape;
import java.lang.Object;
public class Triangle implements Shape2D,Cloneable {

	public double s,a,b,c;
	
	@Override
	public Object clone() {
		try {
			return super.clone();
	         }
	    catch (CloneNotSupportedException e) {
	         System.out.println("Shape: CloneNotSupportedException");
	         return null;
	       }
	   }

	@Override
	public boolean equals(Object obj)
	{
		Triangle temp = (Triangle)obj;
		return this.getArea()==temp.getArea();
	}
	@Override
	public String toString()
	{
		return "area: "+ getArea() +"perimeter: "+ getPerimeter();
	}

	
	Triangle(double a1,double b1,double c1)
	{
		a=a1;
		b=b1;
		c=c1;
	}
	
	public void resize(double a1,double b1,double c1)
	{
		a=a1;
		b=b1;
		c=c1;
	}
	
	public double getArea()
	{
		s=a+b+c/2;
		return (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
	public double getPerimeter()
	{
		return (a+b+c);
	}
	
	public void draw()
	{
		System.out.println("Area of Triangle = "+ getArea() +"Perimeter of a Triangle = "+ getPerimeter() );
	}

}
