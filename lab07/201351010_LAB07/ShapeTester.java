package inheritance.shape;
import java.util.*;
import java.lang.Object;
public class ShapeTester{

	public static void main(String[] args)	// MAIN FUNCTION
	{
	ArrayList<Shape> l1 = new ArrayList<Shape>();	// ARRAY LIST

	Shape C = new Circle(2);	// CIRCLE
	Shape2D C2 = (Shape2D)C;
	l1.add(C2);
	
	Shape T = new Triangle(3,4,5);	// TRIANGLE
	Shape2D T2 = (Shape2D)T;
	l1.add(T2);
	
	
	Shape R = new Rectangle(3,4);	// RECTANGLE
	Shape2D R2 = (Shape2D)R;
	l1.add(R2);
	
	Shape CY = new Cylinder(1,2);	// CYLINDER
	Shape3D CY2 = (Shape3D)CY;
	l1.add(CY2);
	
	Shape P = new Prism(1,2,3,4);	// PRISM
	Shape3D P2 = (Shape3D)P;
	l1.add(P2);
	
	Shape PY = new Pyramid(1,2,3);	// PYRAMID
	Shape3D PY2 = (Shape3D)PY;
	l1.add(PY2);
	
	Shape C1 = new Circle(3);		// CIRCLE
	Shape2D C3 = (Shape2D)C1;
	l1.add(C3);

	
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i));
	}
									// VALUES ADDED
	System.out.println();
	
	Circle temp0 = (Circle)l1.get(0);	// RESIZE CIRCLE
	temp0.resize(5);
	l1.set(0,temp0);

	Triangle temp1 = (Triangle)l1.get(1);	// RESIZE TRIANGLE
	temp1.resize(7,8,9);
	l1.set(1,temp1);
		
	Rectangle temp2 = (Rectangle)l1.get(2);	// RESIZE RECTANGLE
	temp2.resize(5,6);
	l1.set(2,temp2);
	
	Cylinder temp3 = (Cylinder)l1.get(3);	// RESIZE CYLINDER
	temp3.resize(7,8);
	l1.set(3,temp3);
	
	Prism temp4 = (Prism)l1.get(4);			// RESIZE PRISM
	temp4.resize(7,8,9,10);
	l1.set(4,temp4);
	
	Pyramid temp5 = (Pyramid)l1.get(5);		// RESIZE PYRAMID
	temp5.resize(9,10,11);
	l1.set(5,temp5);
	
	Circle temp6 = (Circle)l1.get(6);		// RESIZE CIRCLE
	temp6.resize(4);
	l1.set(6,temp6);

	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i).toString());
	}

	Object s_t=new Circle();				// CLONE OF CIRCLE
	s_t=l1.get(0).clone();
	System.out.println("\nORIGINAL VARIABLE: ");
	System.out.println(l1.get(0));
	System.out.println("CLONE OBJECT: ");
	System.out.println(s_t);
	System.out.println("ARE TWO CIRCLES SAME?: ");
	System.out.println("EXPECTED: TRUE");
	System.out.println(l1.get(0).equals(s_t));
	
	
	Object s_t1=new Circle(2);				// CLONE OF TRIANGLE COMPARED WITH CIRCLE
	System.out.println("\nORIGINAL VARIABLE: ");
	System.out.println(s_t1);
	System.out.println("CLONE OBJECT: ");
	System.out.println(l1.get(6));
	s_t1=l1.get(6).clone();
	System.out.println("ARE TWO CIRCLES SAME?: ");
	System.out.println("EXPECTED: FALSE");
	System.out.println(l1.get(0).equals(s_t1));
	}
}
// END OF CLASS